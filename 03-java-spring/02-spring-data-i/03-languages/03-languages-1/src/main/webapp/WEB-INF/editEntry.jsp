<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit An Entry</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="containter">
<h1>Update The Entry</h1>
<a class="btn btn-primary" href="/languages">Dashboard</a>
<hr>
<form:form method="post" action="/languages/edit/${lang.id}" modelAttribute="language">
	<form:label path="name">Name</form:label>
	<form:input path="name" value="${lang.name}"/>
	<form:errors path="name"/>
	<hr>
	<form:label path="creator">Creator</form:label>
	<form:input path="creator" value="${lang.creator}"/>
	<form:errors path="creator"/>
	<hr>
	<form:label path="version">Version</form:label>
	<form:input path="version" value="${lang.version}"/>
	<form:errors path="version"/>
	<hr>
	<input class="btn btn-primary" value="submit" type="Submit"/>
</form:form>
</body>
</html>