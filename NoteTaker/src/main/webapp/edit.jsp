<%@page import="com.entites.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1>Edit your Note</h1>
		<br>
		<%
		int noteId=Integer.parseInt(request.getParameter("note_id").trim());
		Session s=FactoryProvider.getFactory().openSession();
		Note note=(Note)s.get(Note.class,noteId);
		s.close();
		%>
		
		<!-- Form -->
		<form action="UpdateServlet" method="post">
			<input value="<%=note.getId() %>" name="noteId" type="hidden">
			<div class="form-group">
				<label for="title">Note Title</label> 
				<input
					type="text" 
					name="title"
					class="form-control" 
					id="title"
					aria-describedby="emailHelp" 
					placeholder="Enter Here"
					value="<%=note.getTitle() %>"
					required="required">
			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea 
				required="required" 
				name="content"
				class="form-control"
				id="content" 
				placeholder="Enter your content"
				style="height:200px;"><%=note.getContent() %>
				</textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save</button>
			</div>
		</form>
		
	</div>
</body>
</html>