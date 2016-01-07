<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="personTwo" type = "com.jsp.model.Person" class="com.jsp.model.Employee" >
		<!-- means any property -->
		<jsp:setProperty name="personTwo" property="*" /> 
	</jsp:useBean>
	
	<!-- property must match the field in Java Bean -->
	Person is: <jsp:getProperty name="personTwo" property="name"/>
	ID is: <jsp:getProperty name="personTwo" property="empID"/>
	
	
	
	<!-- if the previous using person then the attribute person will be override -->
	Dog's name is: ${person.dog.breed} 
	
</body>
</html>