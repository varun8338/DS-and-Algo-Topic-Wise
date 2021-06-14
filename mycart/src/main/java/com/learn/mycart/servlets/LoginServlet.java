package com.learn.mycart.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.mycart.dao.UserDao;
import com.learn.mycart.entities.User;
import com.learn.mycart.helper.FactoryProvider;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			String userEmail=request.getParameter("user_email");
			String userPassword=request.getParameter("user_password");
			//authenticating user
			UserDao userdao = new UserDao(FactoryProvider.getFactory());
			User user=userdao.getUserByEmailAndPassword(userEmail, userPassword);
			HttpSession httpSession = request.getSession();
			if(user==null) {
				System.out.println("user is null");
				httpSession.setAttribute("message", "Invalid Credentials");
				response.sendRedirect("login.jsp");
				return;
			}
			
			else {
				httpSession.setAttribute("current-user", user);
				System.out.println(user.getUserType());
				if(user.getUserType().equals("admin")) {
					System.out.println("user is admin");
					response.sendRedirect("admin.jsp");
				}
				else if(user.getUserType().equals("normal")) {
					System.out.println("user is normal");
					response.sendRedirect("index.jsp");
				}
				else {
					
				}
			}
				
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		doGet(request, response);
	}

}
