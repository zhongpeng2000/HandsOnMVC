<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Result</h1>

	<h1>  param.hobbies:  ${param.hobbies}</h1>
	<h1>  paramValue.hobbies: ${paramValue.hobbies}</h1>
	<h1>  paramValues.hobbies[0]: ${paramValues.hobbies[0]}</h1>
	<h1>  paramValues.hobbies[1]: ${paramValues.hobbies[1]}</h1>
	<h1>  paramValues[hobbies][0]: ${paramValues[hobbies][0]}</h1>
	<h1>  paramValues[hobbies][1]: ${paramValues[hobbies][1]}</h1>
	<h1>  paramValues["hobbies"][0]: ${paramValues['hobbies'][0]}</h1>
	<h1>  paramValues["hobbies"][1]: ${paramValues["hobbies"][1]}</h1>

</body>
</html>