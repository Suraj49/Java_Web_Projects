package com.web_App9.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_App9.model.DAOSarvice;
import com.web_App9.model.DAOServicImpl;

@WebServlet("/update")
public class UpdateRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateRegController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("emailId");
		String mobile = request.getParameter("mobile");

		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/updateReg.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		DAOSarvice service = new DAOServicImpl();
		service.connectDB();
		service.updateReg(email, mobile);

		ResultSet result = service.listAllRegistrations();

		request.setAttribute("result", result);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_Regi.jsp");
		rd.forward(request, response);

	}

}
