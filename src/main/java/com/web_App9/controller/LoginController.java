package com.web_App9.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web_App9.model.DAOSarvice;
import com.web_App9.model.DAOServicImpl;

@WebServlet("/verifylogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOSarvice sarvice=new DAOServicImpl();
		sarvice.connectDB();
		boolean status = sarvice.verifyCredentials(email, password);
		if(status==true) {
			
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			
			session.setMaxInactiveInterval(20);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/CreateReg.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "Invalid user name / password");
			RequestDispatcher rd = request.getRequestDispatcher("Wellcome.jsp");
			rd.forward(request, response);
		}
		}catch(Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Wellcome.jsp");
			rd.forward(request, response);
		}
	 }

}
