<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%--Thêm bootrap vao web --%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--Thêm bootrap vao web --%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<%-- <div style="background-color: #d0d0d0; heigh:100px;"> 
		<h5>HELLO, ${sessionScope.username}</h5>
		
		<a href="${pageContext.request.contextPath}/home">HOME</a>
		
		<a href="${pageContext.request.contextPath}/bookList">BOOK LIST</a>
		
		<a href="${pageContext.request.contextPath}/createBook">ADD BOOK</a>
		
		<a href="${pageContext.request.contextPath}/logout">LOGOUT</a>
	</div> --%>
	<h5>HELLO, ${sessionScope.username}</h5>
	<div class="container">
	<div class="col-md-14">
				<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
				
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item active"><a class="nav-link"
								href="${pageContext.request.contextPath}/home">HOME</a></li>
							<li class="nav-item active"><a class="nav-link"
								href="${pageContext.request.contextPath}/bookList">BOOK LIST</a></li>
							<li class="nav-item active"><a class="nav-link"
								href="${pageContext.request.contextPath}/createBook">CREATE BOOK</a></li>
							<li class="nav-item active"><a class="nav-link"
								href="${pageContext.request.contextPath}/logout">LOGOUT</a></li>	
						</ul>
					</div>
				</nav>
			</div>
	</div>		
</body>
</html>