<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Roster</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body class="container">
	<h1>${dojo.name} Roster: </h1>
	<hr>
	<table>
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Age</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allNinjas}" var="nin">
				<tr>
					<td>${nin.firstName}</td>
					<td>${nin.lastName}</td>
					<td>${nin.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<a class="btn btn-primary" href="/">Create New Dojo</a>
</body>
</html>