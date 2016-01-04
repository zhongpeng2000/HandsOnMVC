/**
 * 
 */
package com.example.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhongpeng
 *
 */
@WebServlet(urlPatterns = "/setAttribute")
public class setAttribute extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int var1 = 22;
	private int var2 = 42;
	
	private int var3 = 2;
	private int var4 = 4;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("test context attributes<br/>");
		
		//synchronized (getServletContext()) {
			
			getServletContext().setAttribute("foo", var1++);
			getServletContext().setAttribute("bar", var2++);
			
			request.setAttribute("foo2",var3++);
			request.setAttribute("bar2",var4++);
			
			out.println("I fail in sleep <br/>");
			
			
			// using setAttributeTwo to change the variable;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			out.println("I am awake <br/>");
			out.println(getServletContext().getAttribute("foo"));
			out.println(getServletContext().getAttribute("bar"));
			
			out.println("<br/>");
			out.println(request.getAttribute("foo2"));
			out.println(request.getAttribute("bar2"));
			
		//}
		

	}
}