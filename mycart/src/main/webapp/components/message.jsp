
<%
	String message=(String)session.getAttribute("message");
	Integer flag=(Integer)session.getAttribute("flag");
	if(message!=null){
		if(flag!=null){
			if(flag==1){		
%>
<div class="alert alert-danger alert-dismissible fade show" role="alert">
	<strong><%=message %></strong>
	<button type="button" class="close" data-dismiss="alert"
		aria-label="Close">
		<span aria-hidden="true">&times;</span>
	</button>
</div>
<%}
		else{	%>

<div class="alert alert-success alert-dismissible fade show"
	role="alert">
	<strong><%=message %></strong>
	<button type="button" class="close" data-dismiss="alert"
		aria-label="Close">
		<span aria-hidden="true">&times;</span>
	</button>
</div>
<%}
		
		}
		if(message.equals("Invalid Credentials")){
			
%>
<div class="alert alert-danger alert-dismissible fade show"
	role="alert">
	<strong><%=message %></strong>
	<button type="button" class="close" data-dismiss="alert"
		aria-label="Close">
		<span aria-hidden="true">&times;</span>
	</button>
</div>
<%
			
		}
		
		if(message.contains(" successfully added to category")){ 
		%>
		<div class="alert alert-success alert-dismissible fade show"
			role="alert">
			<strong><%=message %></strong>
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
		
		<%}
		
		if(message.equals("Product added successfully")){
			%>
			<div class="alert alert-success alert-dismissible fade show"
			role="alert">
				<strong><%=message %></strong>
				<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
		<%}
		session.removeAttribute("message");
		session.removeAttribute("flag");
	}%>