/**
 * 
 */
package com.example.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhongpeng
 *
 */
@WebServlet(urlPatterns = "/setAttributeTwo")
public class setAttributeTwo extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("test context attributes<br/>");
		//synchronized (getServletContext()) {
			getServletContext().setAttribute("foo", "22");
			getServletContext().setAttribute("bar", "21");
		//}

	}
}