<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Review Info Page</title>
</head>
<body>
	<h3>Check your survey to see if you want to make changes</h3>
	<label>Name: </label> <c:out value="${name}"/>
	<label>Dojo Location: </label> <c:out value="${location}"/>
	<label>Favorite Language: </label> <c:out value="${language}"/>
	<label>Comments: </label> <c:out value="${comment}"/>
</body>
</html>