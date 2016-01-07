/**
 * 
 */
package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhongpeng
 *
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		//user@google.com, password
		
		req.setAttribute("email", email);
		req.setAttribute("password", password);
		
		if(email.equalsIgnoreCase("zhongpeng2000@gmail.com")&& password.equalsIgnoreCase("123456")){
			req.getRequestDispatcher("WEB-INF/views/success.jsp").forward(req, resp);

		}
		else {
			req.getRequestDispatcher("WEB-INF/views/success.jsp").forward(req, resp);
		}
		
	}
}
