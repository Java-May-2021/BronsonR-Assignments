<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="JavaScript/alerts2.js"></script>
</head>
<body class="time">
	<h1>Here is the Time</h1>
	<div>
		<c:out value="${time}"/>
	</div>
</body>
</html>