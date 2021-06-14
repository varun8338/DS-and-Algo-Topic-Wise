package com.learn.mycart.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learn.mycart.entities.User;
import com.learn.mycart.helper.FactoryProvider;
import com.learn.mycart.helper.Mail;


/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside doPost");
			String userName=request.getParameter("user_name");
			String userEmail=request.getParameter("user_email");
			String userPassword=request.getParameter("user_password");
			String userPhone=request.getParameter("user_phone");
			String userAddress=request.getParameter("user_address");
			System.out.println(userPassword);
			if(userName.isEmpty()||userEmail.isEmpty()
					||userPassword.isEmpty()
					||userPhone.isEmpty()
					||userAddress.isEmpty())
			{
				return;
			}
			
			HttpSession httpSession = request.getSession();
			User user=new User(userName, userEmail, userPassword, userPhone, "default.jpg", userAddress,"normal");
			Session hibernateSession=FactoryProvider.getFactory().openSession();
			Query q=hibernateSession.createQuery("from User where userEmail=:x");
			q.setParameter("x",userEmail);
			List<User> users=q.list();
			if(users.size()>0) {
				System.out.println("Inside if");
				httpSession.setAttribute("message", "User Already Registered");
				httpSession.setAttribute("flag", 1);
				response.sendRedirect("register.jsp");
				hibernateSession.close();
				return;
			}
			
			Transaction tx=hibernateSession.beginTransaction();
			hibernateSession.save(user);
			System.out.println("Saved");
			tx.commit();
			hibernateSession.close();
			httpSession.setAttribute("flag", 2);
			httpSession.setAttribute("message", "Successfully registered");
			new Mail().sendMail(userEmail,userName);
			response.sendRedirect("register.jsp");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		doGet(request, response);
	}

}
