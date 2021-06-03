<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
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
					<form method="post" action="/languages/delete/${lang.id}" >
					<input type="hidden" name="_method" value="Delete" />
					<button class="btn btn-danger">Delete</button>
					</form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form method="POST" action="/languages" modelAttribute="language">
		<form:label path="name">Name</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		<hr>
		<form:label path="creator">Creator</form:label>
		<form:errors path="creator"/>
		<form:input path="creator"/>
		<hr>
		<form:label path="version">Version</form:label>
		<form:errors path="version"/>
		<form:input path="version"/>
		<hr>
		<input type="submit" class="btn btn-secondary" value="Submit"/>
	</form:form>
</body>
</html>