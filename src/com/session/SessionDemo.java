/**
 * 
 */
package com.session;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/session")
public class SessionDemo extends HttpServlet{
	//GET
	//localhost:8080 => GET
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test session attributes<br/>");
		
		HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(30);
		
//		Cookie cookie = new Cookie("username", "haha");
//		cookie.setMaxAge(30);
//		response.addCookie(cookie);
		
		
		if(session.isNew()) {
			out.println("This is a new session.");
		}else {
			out.println("Welcome back! <br/>");
			
			out.println(session.getMaxInactiveInterval());
		}
		
		
	}

}
