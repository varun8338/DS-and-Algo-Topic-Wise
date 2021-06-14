<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Welcome to ${companyName } founded in ${year } </h1>
	<h2>Here are the list of founders</h2>
	
	<c:forEach var="item" items="${founders }">
		<strong>${item }</strong><br>
	</c:forEach>
	<h4>Click here to <a href="contact">Login</a></h4>
	
	
</body>
</html>