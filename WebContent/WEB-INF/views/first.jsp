<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello World</h1>
<h1>Hello World</h1>
<h1>Hello World</h1>
<h1> ${num>3}</h1>
<h1> ${integer le 12}</h1>
<h1> ${requestScope["integer"] ne 4 and 6 le num || false}</h1>
<h1> ${requestScope["list"]}</h1>

<h1> ${42 div 0}</h1>
<h1> ${42 / 0}</h1>


<h1> ${foo}</h1>


<h1> ${foo + 7}</h1>


<h1> ${foo == 7}</h1>

</body>
</html>