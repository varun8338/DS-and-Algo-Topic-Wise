<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h2>${companyName } founded by ${founder }</h2>
	<h4>Welcome ${user.userName}</h4>
	<p>Your password is ${user.userPassword}</p>
</body>
</html>