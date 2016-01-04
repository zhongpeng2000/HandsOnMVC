package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/presession")
public class PreSession extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("test session <br/>");
		
		HttpSession session = req.getSession(false);
		

		
		if(session == null) {
			out.println("no session was avaliable");
			out.println("make one....");
			
			session  = req.getSession();
		}else {
			 Date creationTime = new Date(session.getCreationTime());
			 Date lastAccessed = new Date(session.getLastAccessedTime());
			
			out.println("there was a session");
			out.println("creat time: " + creationTime + "<br/>");
			out.println("last modified time: " + lastAccessed + "<br/>");
			out.println(session.getId());
		}
	}
}
