	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="edu.jps2.model.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is admin page</title>
</head>
<body>
	<p>You are successfully logged in!</p>
	<a href="addUser">Add User</a>
	<table>
		<tr>
			<th>ID</th>
			<th>Avatar</th>
			<th>Email</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Role</th>
			
		</tr>
		<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.ID}</td>
			<td><a href="editUser?id=${user.ID}">Edit</a></td>
			<td><a href="deleteUser?id=${user.ID}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>