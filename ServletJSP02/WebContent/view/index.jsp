<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="edu.jps2.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is index page</title>
</head>
<body>
	<p>You are successfully logged in!</p>
	<% 
		User userBean = (User) request.getSession().getAttribute("userBean");
		out.print("Welcome, " + userBean.getUsername());
	%>
</body>
</html>