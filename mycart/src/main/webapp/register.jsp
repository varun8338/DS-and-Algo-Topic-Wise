<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="container">
		<div class="row mt-2">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<%@include file="components/message.jsp" %>
					<div class="card-body">
						<div class="container text-center">
							<img alt="" src="img/registerIcon.png" class="img-fluid mx-auto"
								style="max-width: 100px;">
						</div>

						<h3 class="text-center my-3">Sign Up Here</h3>
						<form action="RegisterServlet" method="post">
							<div class="form-group">
								<label for="name">User Name</label> <input type="text"
									class="form-control" id="name" name="user_name" aria-describedby="emailHelp"
									placeholder="Enter here">
							</div>
							<div class="form-group">
								<label for="email">Email</label> <input type="email"
									name="user_email" class="form-control" id="email" aria-describedby="emailHelp"
									placeholder="Enter here">
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									name="user_password" class="form-control" id="password" aria-describedby="emailHelp"
									placeholder="Enter here">
							</div>
							<div class="form-group">
								<label for="phone">Phone</label> <input type="number"
									name="user_phone" class="form-control" id="number" aria-describedby="emailHelp"
									placeholder="Enter here">
							</div>

							<div class="form-group">
								<label for="address">Address</label>
								<textarea class="form-control" placeholder="Enter here"
									name="user_address" style="height: 150px;"></textarea>
							</div>

							<div class="container text-center">
								<button type="submit" class="btn btn-outline-success">Register</button>
								<button type="reset" class="btn btn-outline-warning">Reset</button>
							</div>

						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>