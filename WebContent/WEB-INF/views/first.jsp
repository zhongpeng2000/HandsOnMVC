<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello World</h1>
<h1>Hello World</h1>
<h1>Hello World</h1>
<h1> ${banana} is a nice </h1>

<p> Hello <%= request.getAttribute("banana") %></p>
<%-- <p> Hello <c:out  /></p> --%>

</body>
</html>