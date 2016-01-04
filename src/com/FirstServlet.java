package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet{
	//GET
	//localhost:8080 => GET
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		String c = req.getParameter("color");
		req.setAttribute("banana", "apple");
		req.getRequestDispatcher("/WEB-INF/views/first.jsp").forward(req, resp);
		
	}

}
