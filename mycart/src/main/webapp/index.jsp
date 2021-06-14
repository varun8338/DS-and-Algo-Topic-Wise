<%@page import="com.learn.mycart.helper.Helper"%>
<%@page import="com.learn.mycart.entities.Category"%>
<%@page import="com.learn.mycart.dao.CategoryDao"%>
<%@page import="com.learn.mycart.entities.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.learn.mycart.dao.ProductDao"%>
<%@page import="com.learn.mycart.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<div class="container-fluid">
<div class="row">
	<%
		String cat=request.getParameter("category");		
		ProductDao pDao = new ProductDao(FactoryProvider.getFactory());
		List<Product> listProduct = null;
		if(cat==null||cat.trim().equals("all")){
			listProduct = pDao.getAllProducts();
		}
		
		else {
			int cId = Integer.parseInt(cat.trim());
			listProduct = pDao.getAllProductsById(cId);
		}
		
		
		
		CategoryDao cDao = new CategoryDao(FactoryProvider.getFactory());
		List<Category> listCategory = cDao.getCategories();
	%>
	
		<!-- show categories -->
		<div class="col-md-2">
			<div class="list-group mt-4">
				<%if(cat==null||cat.trim().equals("all")){ %>
			
				<a href="index.jsp?category=all" class="list-group-item list-group-item-action active">
    				All Products
  				</a>
  				
  				<%}
				else{
				%>
				
				<a href="index.jsp?category=all" class="list-group-item list-group-item-action">
    				All Products
  				</a>
  				
				<%} %>
  				<%
  					for(Category c:listCategory){
  						if(cat==null||cat.trim().equals("all")||Integer.parseInt(cat.trim())!=c.getCategoryId()){			
  				%>
  						<a href="index.jsp?category=<%=c.getCategoryId() %>" class="list-group-item list-group-item-action"><%=c.getCategoryTitle() %></a>
  					<%}
  						
  				else{%>
  				<a href="index.jsp?category=<%=c.getCategoryId() %>" class="list-group-item list-group-item-action active"><%=c.getCategoryTitle() %></a>
  				<%} 
  				
  				} 
  					%>
  					
  				
			</div>
		</div>
	
		<!-- show products -->
		<div class="col-md-10">
			<div class="row mt-4">
				<div class="col-md-12">
					<div class="card-columns">
						<!-- traversing products -->
						<%for(Product p:listProduct){ %>
						<div class="card product-card">
							<div class="container text-center" data-toggle="modal" data-target="#product<%=p.getpId() %>">
								<img class="card-img-top m-1" src="img/products/<%=p.getpPhoto() %>" style="max-height: 270px;max-width: 100%; width: auto;" alt="Card image cap">	
							</div>
							
							<div class="card-body" data-toggle="modal" data-target="#product<%=p.getpId() %>">
								<h5 class="card-title"><%=p.getpName() %></h5>
								<p class="card-text"><%=Helper.get10Words(p.getpDesc()) %></p>
							</div>
							
							<div class="card-footer text-center">
								<button class="btn btn-outline custom-bg text-white p-1" onclick="add_to_cart(<%=p.getpId()%>,'<%=p.getpName() %>',<%=p.getPriceAfterDiscount()%>)">Add to cart</button>
								<button class="btn btn-outline-success p-1">&#8377; <%=p.getPriceAfterDiscount() %>/- <span class="discount-label"><del> &#8377; <%=p.getpPrice() %></del>, <%=p.getpDiscount() %>% off </span></button>
							</div>
						
						</div>
						<!-- Product Description Modal -->
						<div class="modal fade" id="product<%=p.getpId() %>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  							<div class="modal-dialog modal-lg" role="document">
    							<div class="modal-content">
      								<div class="modal-header">
      									<div class="container text-center">
      										<h5 class="modal-title" id="exampleModalLabel"><%=p.getpName() %></h5>
      									</div>
        					
      								</div>
      								<div class="modal-body">
        								<div class="card">
        									<div class="container text-center">
												<img class="card-img-top m-1" src="img/products/<%=p.getpPhoto() %>" style="max-height: 270px;max-width: 100%; width: auto;" alt="Card image cap">	
											</div>
        									<div class="card-body">
												<p class="card-text"><%=p.getpDesc() %></p>
											</div>
        								</div>
      								</div>
      								<div class="modal-footer">
        								<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        								<!-- <button type="button" class="btn btn-primary checkout-btn">Checkout</button> -->
      								</div>
    							</div>
  							</div>
						</div>
						<%}
						if(listProduct.size()==0){
						%>
							<h3>No Items in this category</h3>
						<%} %>
					</div>	
					
				</div>
			</div>
		</div>
	
	
</div>
</div>
<%@include file="components/common_modals.jsp" %>
</body>
</html>