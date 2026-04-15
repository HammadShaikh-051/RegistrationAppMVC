package com.app;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String pass = request.getParameter("upass");
		String city = request.getParameter("ucity");
		
		Model model = new Model();
		model.setUname(name);
		model.setUemail(email);
		model.setUpass(pass);
		model.setUcity(city);
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		
		int rowsAffected = model.register();
		if (rowsAffected == 0) {
			response.sendRedirect("/RegistrationAppMVC/failure.jsp");
		} else {
			response.sendRedirect("/RegistrationAppMVC/success.jsp");
		}
	}

}
