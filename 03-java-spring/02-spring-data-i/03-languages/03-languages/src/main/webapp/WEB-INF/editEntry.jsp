<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Your Entry</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container" >
<h1>Update Your Entry</h1>
<a class="btn btn-primary" href="/languages">Dashboard</a>
<hr>
<form:form method="Post" action="/languages" modelAttribute="lang">
		<input type="hidden" name="_method" value="put">
		<label>Name</label>
		<input type="text" name="name" value="${lang.name}">
		<hr>
		<label>Creator</label>
		<input type="text" name="creator" value="${lang.creator}">
		<hr>
		<label>Version</label>
		<input type="text" name="version" value="${lang.version}">
		<hr>
		<button type="button" class="btn btn-secondary">Submit</button>
		
</form:form>
<hr>		
</body>
</html>