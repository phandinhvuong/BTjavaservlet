<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>404 not found</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1 style="color:blue; text-align: center;">404 PAGE NOT FOUND</h1>
	<div style="text-align: center;">
		<img src="<c:url value='/images/404pic.jpg'/>" style="width:800px;" />
	</div>
	
</body>
</html>