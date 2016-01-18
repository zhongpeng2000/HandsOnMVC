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

<%-- <h1>Hello World</h1>
<h1>Hello World</h1>
<h1>Hello World</h1>
<h1> ${num>3}</h1>
<h1> ${integer le 12}</h1>
<h1> ${requestScope["integer"] ne 4 and 6 le num || false}</h1>
<h1> ${requestScope["list"]}</h1>

<h1> ${42 div  0}</h1>
<h1> ${42 / 0}</h1>


<h1> ${foo}</h1>


<h1> ${foo + 7}</h1>


<h1> ${foo == 7}</h1>


<p> Hello <%= request.getAttribute("banana") %></p>
<p> Hello <c:out value = '${pageContent.currentTip}'  /></p>
<h1> ${num>3}</h1>
<h1> ${integer le 12}</h1>
<h1> ${requestScope["integer"] ne 4 and 6 le num || false}</h1>
<h1> ${requestScope["list"]}</h1>

<h1> ${42 div 0}</h1>
<h1> ${42 / 0}</h1>


<h1> ${foo}</h1>


<h1> ${foo + 7}</h1>


<h1> ${foo == 7}</h1> --%>

<h1>${FirstName } </h1>

<h1>${LastName } </h1>

<h1><%= request.getParameter("FirstName") %> </h1>

<h1><%= request.getParameter("LastName") %> </h1>





</body>
</html>