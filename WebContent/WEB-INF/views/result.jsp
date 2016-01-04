<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Beer Recommendation List</h1>

	<%
		List<String> styles = (List<String>) request.getAttribute("styles");
		String c = (request.getAttribute("color").toString());
		out.println("<br> Get Beer color " + "<b>" + c + "</b>");
		for (String a : styles) {
			out.print("<br> try: " + a);
		}
	%>

	<%
		Map<String, String> mp = (Map<String, String>) request.getAttribute("map");
		Iterator it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			out.println("<p>" + pair.getKey() + " = " + pair.getValue() + "</p>");
			it.remove(); // avoids a ConcurrentModificationException
		}
		out.println("<p>" + "ServerPt: " + request.getAttribute("ServerPt") + "</p>");
		out.println("<p>" + "LocalPt: " + request.getAttribute("LocalPt") + "</p>");
		out.println("<p>" + "RemotePt: " + request.getAttribute("RemotePt") + "</p>");
	%>

</body>
</html>