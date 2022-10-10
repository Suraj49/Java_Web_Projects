package com.web_App9.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web_App9.model.DAOSarvice;
import com.web_App9.model.DAOServicImpl;

@WebServlet("/listAll")
public class ListRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListRegistration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("email") != null) {
			DAOSarvice sarvice = new DAOServicImpl();

			sarvice.connectDB();
			ResultSet result = sarvice.listAllRegistrations();

			request.setAttribute("result", result);

			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_Regi.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Wellcome.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
