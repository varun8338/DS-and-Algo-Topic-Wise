<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card mt-3">
					<div class="card-header custom-secondary-bg">
						<h3>Login Here</h3>
					</div>
					<div class="card-body">
					<%@include file="components/message.jsp" %>
						<form action="LoginServlet" method="post">
							<div class="form-group">
								<label for="email">Email address</label> <input
									type="email" 
									name="user_email"
									class="form-control" id="email"
									aria-describedby="emailHelp" placeholder="Enter email">
								<small id="emailHelp" class="form-text text-muted">We'll
									never share your email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input
									type="password" 
									name="user_password"
									class="form-control" id="password"
									placeholder="Password">
							</div>
							<a href="register.jsp" class="text-center mb-2">Click here to register</a>
							<div class="container text-center">
								<button type="submit" class="btn btn-primary border-0">Submit</button>
								<button type="reset" class="btn btn-primary border-0">Reset</button>
							</div>
							
							
						</form>
					</div>
			
				</div>
			</div>
		</div>
	</div>
</body>
</html>