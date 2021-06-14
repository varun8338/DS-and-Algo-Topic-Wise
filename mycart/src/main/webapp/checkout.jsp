<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setDateHeader("Expires", 0);
	response.setHeader("Pragma", "no-cache");
	User user=(User)session.getAttribute("current-user");
	if(user==null){
		session.setAttribute("message", "Invalid Credentials");
		response.sendRedirect("login.jsp");
		return;
	}
%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
		<div class="container">
			<div class="row mt-5">
				<div class="col-md-6">
				<!-- Cart items -->
					<div class="card">
						<div class="card-body">
							<h3 class="text-center mb-5">Your selected items</h3>
							<div class="cart-body">
			
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6">
				<!-- Delivery Details Form -->
					<div class=card>
						<div class="card-body">
							<h3 class="text-center mb-5">Enter Delivery Details</h3>
							<form action="PaymentServlet" onsubmit="paymentStart();" method="GET">
								<div class="form-group">
    								<label for="exampleInputEmail1">Email address</label>
    								<input value="<%=user.getUserEmail() %>" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    								<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  								</div>
  								
  								<div class="form-group">
    								<label for="name">Your Name</label>
    								<input value="<%=user.getUserName() %>" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter name">
  								</div>
  								
  								<div class="form-group">
    								<label for="name">Your Contact</label>
    								<input value="<%=user.getUserPhone() %>" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter name">
  								</div>
  								
  								<div class="form-group">
    								<label for="address">Address</label>
    								<textarea  class="form-control" id="address"></textarea>
  								</div>
  								
  								<div class="container text-center">
  									<button class="btn btn-outline-success" onclick="paymentStart()">Order Now</button>
  									<button class="btn btn-outline-primary" formaction="index.jsp">Continue Shopping</button>
  									
  								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	<%@include file="components/common_modals.jsp" %>
</body>
</html>