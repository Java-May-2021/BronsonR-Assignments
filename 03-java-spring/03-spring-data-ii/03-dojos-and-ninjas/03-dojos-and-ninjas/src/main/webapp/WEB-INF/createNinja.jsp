<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Your Ninja</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body class="container">
	<h1>Register Your Ninja To A Dojo</h1>
	<hr>
	<form:form method="post" modelAttribute="nin" action="/ninja">
		<form:label path="dojo">Dojo: </form:label>
		<form:select path="dojo">
			<c:forEach items="${allDojos}" var="doj">
				<option value="${doj.id}">${doj.name}</option>
			</c:forEach>
		</form:select>
		<form:errors path="dojo"/>
		<hr>
		<form:label path="firstName">First Name: </form:label>
		<form:input path="firstName"/>
		<form:errors path="firstName"/>
		<hr>
		<form:label path="lastName">Last Name: </form:label>
		<form:input path="lastName"/>
		<form:errors path="lastName"/>
		<hr>
		<form:label path="age">Age: </form:label>
		<form:input path="age"/>
		<form:errors path="age"/>
		<hr>
		<button class="btn btn-primary">Submit</button>
	</form:form>
</body>
</html>