<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.jsp.model.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Person</title>
</head>
<body>

	<% Person p  = (Person)request.getAttribute("person"); %>
	<p>Person is : <%= p.getName() %></p>
	<p>Person is : <%= ((Person)request.getAttribute("person")).getName() %></p>
	
	<!-- p3 = null -->
	<% Person p3  = (Person)request.getAttribute("person"); %>
	<% p3 = null; %>
	<% pageContext.setAttribute("personThree", p3, PageContext.PAGE_SCOPE); %>
	
	
	<!-- no scripting -->
	
	<jsp:useBean id="person" class="com.jsp.model.Person" scope="request" />
	<p>Person created by Servlet : <jsp:getProperty name="person" property="name" /></p>
	
	<!-- set value  -->
	
	<jsp:useBean id="personTwo" class="com.jsp.model.Person" scope="request" />
	<jsp:setProperty name="personTwo" property="name" value="peng"/>
	<p>Person set by Servlet : <jsp:getProperty name="personTwo" property="name" /></p>
	
	<!-- useBean has a body -->
	<jsp:useBean id="personThree" class="com.jsp.model.Person" scope="page">
		<jsp:setProperty name="personThree" property="name" value="Alex" />
	</jsp:useBean>
	<p>Person set by body Servlet : <jsp:getProperty name="personThree" property="name" /></p>
	
	<!-- using type without class -->
	<% Person p4  = (Person)request.getAttribute("person"); %>
	<% pageContext.setAttribute("personFour", p4, PageContext.REQUEST_SCOPE); %>
	<jsp:useBean id="personFour" type="com.jsp.model.Person" scope="request" />
	<p>Person by type Servlet : <jsp:getProperty name="personFour" property="name" /></p>
	
	<!--  -->

</body>
</html>