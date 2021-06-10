<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create License</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body class="container">
	<h1>Please Enter Information</h1>
	<hr>
	<form:form method="post" action="/license/new" modelAttribute="lice">
		<form:label path="person">Name</form:label>
		<form:select path="person">
			<c:forEach items="${allPerson}" var="pers">
				<c:choose>
					<c:when test="${pers.license == null}">
						<form:option value="${pers.id}">${pers.firstName} ${pers.lastName} </form:option>
					</c:when>
				</c:choose>
			</c:forEach>
		</form:select>
		<form:errors path="person"/>
		<hr>
		<form:label path="state">State</form:label>
		<form:errors path="state"/>
		<form:input path="state"/>
		<hr>
		<form:label path="expiration_date">Expiration Date</form:label>
		<div class="md-form md-outline input-with-post-icon datepicker" inline="true">
 			 <form:input path="expiration_date" placeholder="Select date" type="date" class="form-control"/>
  			 <i class="fas fa-calendar input-prefix"></i>
		</div>
		<form:errors path="expiration_date"/>
		<hr>
		<button class="btn btn-primary">Submit</button>
	</form:form>
	<hr>
	<h3>If Name Not Listed Please Click Below</h3>
	<a class="btn btn-primary" href="/person/new">New Person</a>
	<hr>
	<a class="btn btn-primary" href="/">Home Page</a>
</body>
</html>