<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages Built</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<table class="table table-dark">
		<thead>
			<tr>
				<td>Name</td>
				<td>Creator</td>
				<td>Version</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${allLanguages}" var="lang">
			<tr>
				<td><a href="/languages/${lang.id}">${lang.name}</a></td>
				<td>${lang.creator}</td>
				<td>${lang.version}</td>
				<td><a class="btn btn-primary" href="/languages/edit/${lang.id}">Edit</a>
				 <form id="delete-form" action="/languages/delete/${lang.id}" method="post">
						<input type="hidden" name="_method" value="delete">
					    <input class="btn btn-danger" type="submit" value="Delete">
				</form></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<form:form method="POST" actions="/languages">
		<label>Name</label>
		<input type="text" name="name">
		<hr>
		<label>Creator</label>
		<input type="text" name="creator">
		<hr>
		<label>Version</label>
		<input type="text" name="version">
		<hr>
		<button type="button" class="btn btn-secondary">Submit</button>
	</form:form>
		
</body>
</html>