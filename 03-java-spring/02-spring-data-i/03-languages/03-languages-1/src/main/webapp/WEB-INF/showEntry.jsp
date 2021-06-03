<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Entry View</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
<h1>Language Details</h1>
	<a class="btn btn-primary" href="/languages">Dashboard</a>
	<hr>
	<label>Name: </label> <c:out value="${lang.name}"/>
	<hr>
	<label>Creator: </label> <c:out value="${lang.creator}"/>
	<hr>
	<label>Version: </label> <c:out value="${lang.version}"/>
	<hr>
	<a class="btn btn-primary" href="/languages/edit/${lang.id}">Edit</a>
	<form method="post" action="/languages/delete/${lang.id}" >
		<input type="hidden" name="_method" value="Delete" />
		<button class="btn btn-danger">Delete</button>
	</form>	
</body>
</html>