<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a New Song</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<h1>Add Your Song</h1>
	<a href="/dashboard" class="btn btn-primary">Dashboard</a>
	<hr>
	<form:form method="post" action="/song/new" modelAttribute="song">
		<form:label path="title">Title</form:label>
		<form:errors path="title"/>
		<form:input path="title"/>
		<hr>
		<form:label path="artist">Artist</form:label>
		<form:errors path="artist"/>
		<form:input path="artist"/>
		<hr>
		<form:label path="rating">Rating (1-10)</form:label>
		<form:select path="rating" name="rating">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
		</form:select>
		
		<hr>
		<input type="submit" class="btn btn-primary" value="Add Song"/>
	</form:form>
	
</body>
</html>