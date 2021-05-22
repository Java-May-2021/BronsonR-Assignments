<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Page</title>
</head>
<body>
	<h3>Put in the code</h3>
	<form method="POST" action="/">
		<c:out value="${error}"/>
		<input type="password" name="code">
		<button>Submit</button>
	</form>
</body>
</html>