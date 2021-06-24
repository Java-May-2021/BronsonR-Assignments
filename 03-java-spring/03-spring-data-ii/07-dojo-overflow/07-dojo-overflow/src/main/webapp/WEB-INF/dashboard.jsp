<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body class="container">
	<h1>Dashboard</h1>
	<hr>
	<table>
		<thead>
			<tr>
				<td>Question</td>
				<td>Tags</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allQuestions}" var="que">
				<tr>
					<td><a href="/question/${que.id}">${que.query}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<a class="btn btn-primary" href="/question/new">New Question</a>
</body>
</html>
