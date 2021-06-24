<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Question</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body class="container">
	<h1>Add Your Question</h1>
	<hr>
	<div class="form-group">
		<form:form method="post" action="/question/new" modelAttribute="que">
			<form:label path="query">Question: </form:label>
			<form:errors path="query"/>
			<form:textarea path="query" rows="4"/>
			<hr>
			<div>
				<form:form method="post" modelAttribute="tag">
					<form:label path="subject">Tags: </form:label>
					<form:errors path="subject"/>
					<form:input path="subject"/>
					<hr>
				</form:form>
			</div>
			<input type="submit" value="Sumbit" class="btn btn-primary"/>
		</form:form>
	</div>
</body>
</html>