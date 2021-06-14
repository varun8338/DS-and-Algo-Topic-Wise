<%@page import="com.learn.mycart.dao.ProductDao"%>
<%@page import="com.learn.mycart.dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="com.learn.mycart.entities.Category"%>
<%@page import="com.learn.mycart.helper.FactoryProvider"%>
<%@page import="com.learn.mycart.dao.CategoryDao"%>
<%@page import="com.learn.mycart.entities.User"%>
<%
response.setHeader("Cache-control", "no-cache");
response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
	User user=(User)session.getAttribute("current-user");
	if(user==null){
		session.setAttribute("message", "Invalid Credentials");
		response.sendRedirect("login.jsp");
		return;
	}
	else{
		if(user.getUserType().equals("normal")){
			session.setAttribute("message", "Invalid Credentials");
			response.sendRedirect("login.jsp");
			return;	
		}
	}
	
	long userCount=new UserDao(FactoryProvider.getFactory()).getUserCount();
	long categoryCount=new CategoryDao(FactoryProvider.getFactory()).getCategoryCount();
	long productCount=new ProductDao(FactoryProvider.getFactory()).getProductCount();
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="container admin">
		<div class="container">
			<%@include file="components/message.jsp" %>
		</div>
		<div class="row mt-3">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body text-center text-uppercase text-muted">
						<div class="container">
							<img src="img/users.png" alt="user icon"
								class="img-fluid rounded-circle" style="max-width: 100px;">
						</div>
						<h1><%=userCount %></h1>
						<h1>Users</h1>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body text-center text-uppercase text-muted">
						<img src="img/category.png" alt="user icon"
							class="img-fluid rounded-circle" style="max-width: 100px;">
						<h1><%=categoryCount %></h1>
						<h1>Categories</h1>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body text-center text-uppercase text-muted">
						<img src="img/product.png" alt="user icon"
							class="img-fluid rounded-circle" style="max-width: 100px;">
						<h1><%=productCount %></h1>
						<h1>Products</h1>
					</div>
				</div>
			</div>
		</div>

		<div class="row mt-2 mb-4">
			<div class="col-md-6">
				<div class="card" data-toggle="modal"
					data-target="#add-category-modal">
					<div class="card-body text-center text-uppercase text-muted">
						<img src="img/addCategory.png" alt="user icon"
							class="img-fluid rounded-circle" style="max-width: 100px;">
						<p class="mt-4">click here to add category</p>
						<h1>Add Category</h1>
					</div>
				</div>
			</div>

			<div class="col-md-6">
				<div class="card" data-toggle="modal" data-target="#add-product-modal">
					<div class="card-body text-center text-uppercase text-muted">
						<img src="img/addProduct.png" alt="user icon"
							class="img-fluid rounded-circle" style="max-width: 100px;">
						<p class="mt-4">click here to add product</p>
						<h1>Add Product</h1>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- add category modal -->
	<div class="modal fade" id="add-category-modal" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header custom-secondary-bg">
					<h5 class="modal-title" id="exampleModalLabel">Fill Category
						Details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
				
					<form action="ProductOperationServlet" method="post">
						<input type="hidden" name="operation" value="addCategory">
						<div class="form-group">
							<input type="text" class="form-control" name="catTitle"
								required="required" placeholder="Enter category title">
						</div>

						<div class="form-group">
							<textarea style="height: 200px;" class="form-control"
								placeholder="Enter category description" name="catDescription"
								required="required"></textarea>
						</div>

						<div class="container text-center">
							<button class="btn btn-outline-success">Add Category</button>
							<button type="button" class="btn btn-outline-danger"
								data-dismiss="modal">Close</button>
						</div>
					</form>

				</div>

			</div>
		</div>
	</div>

	<!-- end add category modal -->

	<!-- add product modal -->
	<div class="modal fade" id="add-product-modal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header custom-secondary-bg">
					<h5 class="modal-title" id="exampleModalLabel">Fill Product Details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="ProductOperationServlet" method="post" enctype="multipart/form-data">
						<input type="hidden" name="operation" value="addProduct">
						<div class="form-group">
							<input type="text" class="form-control" name="pName" placeholder="Enter product name" required="required">
						</div>
						
						<!-- product category -->
						
						<%
							CategoryDao cDao = new CategoryDao(FactoryProvider.getFactory());
							List<Category> list = cDao.getCategories();
						%>
						
						<div class="form-group">
							<select name="catId" class="form-control">
								<%for(Category c:list){ %>
								<option value="<%=c.getCategoryId() %>"><%=c.getCategoryTitle() %></option>
								<%} %>
							</select>
						</div>
						
						<div class="form-group">
							<input type="number" class="form-control" name="pPrice" placeholder="Enter product price" required="required">
						</div>
						
						<div class="form-group">
							<input type="number" class="form-control" name="pDiscount" placeholder="Enter product discount" required="required">
						</div>
						
						<div class="form-group">
							<input type="number" class="form-control" name="pQuantity" placeholder="Enter product quantity" required="required">
						</div>
						
						<div class="form-group">
							<textarea class="form-control" name="pDescription" style="height: 150px;" placeholder="Enter product description" required="required"></textarea>
						</div>
						
						<div class="form-group">
							<label for="pPhoto">Select Product picture</label>
							<br>
							<input type="file" id="pPhoto" name="pPhoto" accept="image/*" class="form-control" required="required">
						</div> 
						
						<div class="container text-center">
							<button class="btn btn-outline-success">Add Product</button>
							<button type="button" class="btn btn-outline-danger" data-dismiss="modal">Close</button>
						</div>
						
					</form>
				
				</div>
				
			</div>
		</div>
	</div>

	<!-- end add product modal -->
	<%@include file="components/common_modals.jsp" %>
</body>
</html>


