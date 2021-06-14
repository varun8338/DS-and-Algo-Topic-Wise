<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
	<h2>Here are some FAQs</h2>
	<c:forEach var="question" items="${faqs }">
		<i>${question }</i><br>
	</c:forEach>
</body>
</html>