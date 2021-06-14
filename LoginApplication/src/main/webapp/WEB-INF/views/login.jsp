<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 style="color: red">${errorMessage}</h1>
	<form action="/spring-mvc/login" method="post">
		<label>Name</label><br> <input type="text" name="name"><br>
		<label>Password</label><br> <input type="password"
			name="password"><br> <input type="submit">
	</form>
</body>
</html>