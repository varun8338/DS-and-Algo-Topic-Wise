<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Contact</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">${companyName } founded by ${founder }</h2>
		<h3 class="text-center">Registration Details</h3>
		<form action="process-form" method="post">
			<div class="form-group">
				<label for="userName">User Name</label> 
				<input type="text" 
				class="form-control" 
				id="userName"
				name="userName"
				aria-describedby="emailHelp"
				placeholder="Enter username"> 
				<small id="emailHelp" 
				class="form-text text-muted">We'll never
					share your email with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="userPassword">Password</label> 
				<input type="password" 
				class="form-control" 
				id="userPassword"
				name="userPassword"
				placeholder="Password">
			</div>
			<div class="form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
			
		</form>

	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>