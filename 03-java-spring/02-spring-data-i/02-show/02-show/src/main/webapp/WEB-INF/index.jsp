<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><c:out value="${Book.title}"/></h1>
<p>Description: <c:out value="${Book.description}"/></p>
<p>Language: <c:out value="${Book.language}"/></p>
<p>Number of pages: <c:out value="${Book.pages}"/></p>
<a href="/books/${Book.id}/edit">Edit Book</a>
<form action="/books/${Book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</body>
</html>