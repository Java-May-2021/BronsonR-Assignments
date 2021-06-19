<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add A Category</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<h1>Add A Category To The List</h1>
	<div class="form-group">
		<form:form method="post" action="/category" modelAttribute="cate">
			<form:label path="name">Name: </form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
			<button class="btn btn-success">Add Category</button>
		</form:form>
	</div>
</body>
</html>