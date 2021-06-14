<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web App</title>
</head>
<body>
	<form action="/login.do" method="post">
		<label>Name</label><br>
		<input type="text" name="name"><br>
		<label>Password</label><br>
		<input type="password" name="password"><br>
		<input type="submit">
	</form>
</body>
</html>