<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category View</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<h1>${cate.name}</h1>
	<hr>
	<h4>Products: </h4>
	<ul>
		<c:forEach items="${catProd}" var="prod">
			<li>${prod.name}</li>
		</c:forEach>
	</ul>
	<div class="form-group">
		<form method="post" action="/category/${cate.id}">
			<label>Product:</label>
			<select name="products">
				<c:forEach items="${allProds}" var="prod">
					<c:choose>
						<c:when test="${!prod.categories.contains(cate)}">
							<option value="${prod.id}"> ${prod.name} </option>
						</c:when>
					</c:choose>
				</c:forEach>
			</select>
			<hr>
			<button class="btn btn-success">Add</button>
		</form>
	</div>
</body>
</html>