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
		<c:forEach items="${category.products}" var="prod">
			<li>${prod.name}</li>
		</c:forEach>
	</ul>
	<div class="form-group">
		<form:form method="post" action="/category/{id}" modelAttribute="prod">
			<form:label path="products">Product:</form:label>
			<form:errors path="products"/>
			<form:select path="products">
				<c:forEach items="${allProds}" var="prod">
					<c:choose>
						<c:when test="${category.products == product.categories}">
							<form:option value="${prod.id}"> ${prod.name} </form:option>
						</c:when>
					</c:choose>
				</c:forEach>
			</form:select>
			<button class="btn btn-success">Add</button>
		</form:form>
	</div>
</body>
</html>