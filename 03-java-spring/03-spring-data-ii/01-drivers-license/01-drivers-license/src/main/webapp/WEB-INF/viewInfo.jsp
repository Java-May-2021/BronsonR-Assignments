<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Info</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<h1>Thank You. Here Is Your Info.</h1>
	<h3>Please print/save for your records. Documents will be sent out in 5-7 business days.</h3>
	<hr>
	<label>First Name: </label> <c:out value="${pers.firstName}"/>
	<hr>
	<label>Last Name: </label> <c:out value="${pers.lastName}"/>
	<hr>
	<label>License Id #: </label> <c:out value="${pers.license.number}"/>
	<hr>
	<label>State: </label> <c:out value="${pers.license.state}"/>
	<hr>
	<label>Expiration: </label> <c:out value="${pers.license.expiration_date}"/>
	<hr>
	<a class="btn btn-primary" href="/">Home Page</a>
	
</body>
</html>