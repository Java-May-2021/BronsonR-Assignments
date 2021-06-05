<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Song Info</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<div class="justify-content-between">
		<h1>Song Details:</h1>
		<a href="/dashboard" class="btn btn-primary">Dashboard</a>
	</div>
	<div>
		<label>Artist: </label> <c:out value="${song.artist}"/>
		<hr>
		<label>Title: </label> <c:out value="${song.title}"/>
		<hr>
		<label>Rating: </label> <c:out value="${song.rating}"/>
	</div>
	<form method="post" action="delete/${song.id}" >
		<input type="hidden" name="_method" value="Delete" />
		<button class="btn btn-danger">Delete</button>
	</form>	
</body>
</html>