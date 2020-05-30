<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<title>Book list</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h2 style="text-align:center; color:blue;">BOOK LIST</h2>
	
	<table border="1" cellpadding="8" cellspacing="1">
		<tr>
          <th>ID</th>
          <th>Name</th>
          <th>Author</th>
          <th>Publisher</th>
          <th>Price</th>
		<th>Photo</th> 
		<th>Create</th>
		  <th>Edit</th>
          <th>Delete</th>
		</tr>
		<c:forEach items="${bookList}" var="book">
          <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.publisher}</td>
            <td>${book.price}</td>
            <td><img src="data:image/jpeg;base64,${book.photo}" width="170px" height="220px"/></td>
			<td>${book.create}</td>
			
			
			<td><a href="updateBook?id=${book.id}">Update</a></td>
			<td><a href="deleteBook?id=${book.id}">Delete</a></td>
          </tr>
		</c:forEach>
    </table>
</body>
</html>