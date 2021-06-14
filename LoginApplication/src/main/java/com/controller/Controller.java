package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/login.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/view.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		if(password.equals("123")) {
			request.setAttribute("name", name);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("/WEB-INF/views/view.jsp").forward(request, response);
	}
	


}
