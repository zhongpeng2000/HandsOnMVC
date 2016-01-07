<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/NoServlet">
		name: <input type="text" name="name"/>
		ID#: <input type="number" name="empID"/>
		<input type="submit" value="submit"/>
	</form>

</body>
</html>