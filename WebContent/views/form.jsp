<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Beer Selection Page</h1>
	<form method="post"
		action="${pageContext.request.contextPath}/BeerSelect">
		<h2>Select Beer Characteristics</h2>
		<select name="color" size="1">
			<option value="light">light</option>
			<option value="amber">amber</option>
			<option value="brown">brown</option>
			<option value="dark">dark</option>
		</select> <br /> <br /> <input type="submit" value="submit">

	</form>
</body>
</html>