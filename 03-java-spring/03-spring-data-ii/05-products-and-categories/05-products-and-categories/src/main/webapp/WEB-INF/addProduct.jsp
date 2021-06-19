<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Product</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<h1>Add Your Product</h1>
	<div class="form-group">
		<form:form method="post" action="/product" modelAttribute="prod">
			<form:label path="name">Name: </form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
			<hr>
			<form:label path="description">Description: </form:label>
			<form:errors path="description"/>
			<form:input path="description"/>
			<hr>
			<form:label path="price">Price: </form:label>
			<form:errors path="price"/>
			<form:input path="price"/>
			<hr>
			<button class="btn btn-success">Add Product</button>
		</form:form>
	</div>
</body>
</html>