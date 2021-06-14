package com.learn.mycart.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.learn.mycart.dao.CategoryDao;
import com.learn.mycart.dao.ProductDao;
import com.learn.mycart.entities.Category;
import com.learn.mycart.entities.Product;
import com.learn.mycart.helper.FactoryProvider;
import com.mysql.cj.protocol.PacketReceivedTimeHolder;

@MultipartConfig
public class ProductOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductOperationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fetches value of operation
		
		String op=request.getParameter("operation").trim();
		if(op.equals("addCategory")) {
			//add category
			String title = request.getParameter("catTitle");
			String desc = request.getParameter("catDescription");
			Category category = new Category(title, desc);
			CategoryDao categoryDao = new CategoryDao(FactoryProvider.getFactory());
			int catId=categoryDao.saveCategory(category);
			System.out.println("Category Added: "+catId);
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message", title+" successfully added to category");
			response.sendRedirect("admin.jsp");
			return;
		}
		
		else if(op.equals("addProduct")) {
			//add product
			String pName=request.getParameter("pName");
			String pCategory=request.getParameter("pCategory");
			int pPrice = Integer.parseInt(request.getParameter("pPrice"));
			int pDiscount = Integer.parseInt(request.getParameter("pDiscount"));
			int pQuantity = Integer.parseInt(request.getParameter("pQuantity"));
			int catId=Integer.parseInt(request.getParameter("catId"));
			String pDescription = request.getParameter("pDescription");
			//Store file
			Part part = request.getPart("pPhoto");
			
			Product p=new Product();
			p.setpName(pName);
			p.setpDesc(pDescription);
			p.setpPrice(pPrice);
			p.setpDiscount(pDiscount);
			p.setpQuantity(pQuantity);
			p.setpPhoto(part.getSubmittedFileName());
			
			CategoryDao cDao=new CategoryDao(FactoryProvider.getFactory());
			Category category = cDao.getCategoryById(catId);
			p.setCategory(category);
			
			ProductDao pDao=new ProductDao(FactoryProvider.getFactory());
			int saveProduct = pDao.saveProduct(p);
			
			//pic upload
			String path=request.getRealPath("img") + File.separator + "products" + File.separator +part.getSubmittedFileName();
			System.out.println("Path "+path);
			FileOutputStream fos=new FileOutputStream(path);
			
			InputStream is=part.getInputStream();
			
			byte[] data=new byte[is.available()];
			
			is.read(data);
			
			//writing the data
			fos.write(data);
			
			fos.close();
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message", "Product added successfully");
			response.sendRedirect("admin.jsp");
			return;
		}
		
		
		
	}

}
