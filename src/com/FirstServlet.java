package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet{
	//GET
	//localhost:8080 => GET
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		

		

		//String c = req.getParameter("color");
		request.setAttribute("banana", "apple");
		//request.getRequestDispatcher("/WEB-INF/views/first.jsp").forward(req, resp);

		
		String num = "2";
		request.setAttribute("num", num);
		Integer integer = new Integer(3);
		request.setAttribute("integer", integer);
		ArrayList list= new ArrayList();
		list.add("true");
		list.add("false");
		list.add("2");
		list.add("10");
		request.setAttribute("list", list);
		
		
		System.out.println(list.get(0).equals("true"));
		//System.out.println(!(Boolean)list.get(1));  Cast Exception
		
		

		//String c = req.getParameter("color");
		req.setAttribute("banana", "apple");
		req.getRequestDispatcher("/WEB-INF/views/first.jsp").forward(req, resp);
		
				
	}

}
