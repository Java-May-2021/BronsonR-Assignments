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
		<c:forEach items="${product.categories}" var="cat">
			<li>${cat.name}</li>
		</c:forEach>
	</ul>
	<div class="form-group">
		<form:form method="post" action="/product/{id}" modelAttribute="cate">
			<form:label path="categories">Categories:</form:label>
			<form:errors path="categories"/>
			<form:select path="categories">
				<c:forEach items="${allCats}" var="cat">
					<c:choose>
						<c:when test="${product.categories == category.products}">
							<form:option value="${cat.id}"> ${cat.name} </form:option>
						</c:when>
					</c:choose>
				</c:forEach>
			</form:select>
			<button class="btn btn-success">Add</button>
		</form:form>
	</div>
</body>
</html>