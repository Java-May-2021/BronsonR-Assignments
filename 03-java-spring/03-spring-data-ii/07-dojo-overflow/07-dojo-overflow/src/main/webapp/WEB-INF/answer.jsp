<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Answer the Question</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body class="container">
	<h1>${que.query}</h1>
	<hr>
	<c:forEach items="${allTags}" var="tag">
		<label>Tags: </label>
		<p>${tag.subject}</p>
	</c:forEach>
	<hr>
	<table>
		<thead>
			<tr>
				<td>Answers</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${question.answers}" var="que">
				<tr>
					<td>${que.answers}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="form-group">
	<form:form method="post" action="/question/${que.id}" modelAttribute="ans">
		<form:label path="response">Answer: </form:label>
		<form:errors path="response"/>
		<form:textarea path="response" rows="3"/>
		<hr>
		<button class="btn btn-primary">Submit</button>
	</form:form>
	</div>
</body>
</html>