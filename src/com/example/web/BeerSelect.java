package com.example.web;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
@WebServlet(urlPatterns = "/BeerSelect")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("views/form.jsp");
		view.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection Advice <br>");
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);
//		System.out.println(c);
//		out.println("<br> Get Beer color " + "<b>" +c + "</b>");
//		
//		for (String a: result){
//			out.print("<br> try: " + a);
//		}
//		String client = request.getContentType() + "\n";
//		client += request.getHeader("User-Agent")+ "\n";
//		client += request.getSession() + "\n";
		
		Map<String, String> map = getHeadersInfo(request);
		
		request.setAttribute("map", map);
		request.setAttribute("styles", result);
		request.setAttribute("color", c );
		request.setAttribute("ServerPt", request.getServerPort() );
		request.setAttribute("LocalPt", request.getLocalPort() );
		request.setAttribute("RemotePt", request.getRemotePort() );
		RequestDispatcher view = request.getRequestDispatcher("/views/result.jsp");
		view.forward(request, response);
		
	}
    
    private Map<String, String> getHeadersInfo(HttpServletRequest request) {

    	Map<String, String> map = new HashMap<String, String>();

    	Enumeration headerNames = request.getHeaderNames();
    	while (headerNames.hasMoreElements()) {
    		String key = (String) headerNames.nextElement();
    		System.out.print(key);
    		String value = request.getHeader(key);
    		System.out.println("  " + value);
    		map.put(key, value);
    	}

    	return map;
      }

}
