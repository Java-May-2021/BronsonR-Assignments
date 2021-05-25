<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Survey Page</title>
</head>
<body>
	<form method="POST" action="/">
	<label>Name</label>
	<input type="text" name="name">
	<label>Dojo Location</label>
		<select name="location">
			<option value="San Jose">San Jose</option>
			<option value="Tulsa">Tulsa</option>
			<option value="Online">Online</option>
		</select>
	<label>Favorite Language</label>
		<select name="language">
			<option value="Python">Python</option>
			<option value="Java">Java</option>
			<option value="Mern">Mern</option>
		</select>
	<label>Comments</label>
	<input type="text" name="comment">
	<button>Submit</button>
	</form>
</body>
</html>