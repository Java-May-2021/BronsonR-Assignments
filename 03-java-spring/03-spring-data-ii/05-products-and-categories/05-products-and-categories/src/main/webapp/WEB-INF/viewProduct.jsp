<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product View</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<h1>${prod.name}</h1>
	<hr>
	<h4>Categories: </h4>
	<ul>
		<c:forEach items="${productCat}" var="cate">
			<li>${cate.name}</li>
		</c:forEach>
	</ul>
	<div class="form-group">
		<form method="post" action="/product/${prod.id}">
			<label>Categories:</label>
			<select name="categories">
				<c:forEach items="${allCats}" var="cat">
					<c:choose>
						<c:when test="${!cat.products.contains(prod)}">
							<option value="${cat.id}"> ${cat.name} </option>
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