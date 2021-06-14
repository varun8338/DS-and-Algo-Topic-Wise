<%@page import="com.learn.mycart.entities.User"%>
<%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setDateHeader("Expires", 0);
response.setHeader("Pragma", "no-cache");
User user1=(User)session.getAttribute("current-user");

%>


<nav class="navbar navbar-expand-lg navbar-light custom-bg">
  <div class="container">
  	<a class="navbar-brand" href="index.jsp">MyCart</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
    </ul>
    
    <ul class="navbar-nav ml-auto">
    
    	<li class="nav-item active">
            		<a class="nav-link" href="#" data-toggle="modal" data-target="#cart"><i class="fas fa-shopping-cart" style="font-size: 20px;"></i><span class="ml-1 cart-items" style="font-size: 18px;">( 0 )</span></a>
            	<li>
    	<%if(user1==null){ %>
    			<li class="nav-item active">
            		<a class="nav-link" href="login.jsp">Login</a>
            	<li>
            
           		<li class="nav-item active">
            		<a class="nav-link" href="register.jsp">Register</a>
          		</li>
    	<% }
    		else{
    			%>
    			<li class="nav-item active">
            		<a class="nav-link" href="<%= user1.getUserType().equals("admin") ? "admin.jsp" : "index.jsp"%>"><%=user1.getUserName() %></a>
            	</li>
            
            	<li class="nav-item active">
            		<a class="nav-link" href="LogoutServlet" onclick="clearProducts()">Logout</a>
          		</li>
    		<%}%>
    
    	
    </ul>
    
  </div>
  </div>
</nav>