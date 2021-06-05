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
	<div>
		<a href="/song/new" class="btn btn-info">Add New Song</a>
		<a href="/search/topten" class="btn btn-success">Top Ten List</a>
	</div>
	<form action="/search" class="form-inline">
	<div class="input-group">
 		<input type="text" class="form-control rounded" placeholder="Search" aria-label="Search"
    	aria-describedby="search-addon" name="artist"/>
  		<button class="btn btn-outline-primary">Search Artists</button>
  	</div>
  	</form>
	<table class="table table-light">
		<thead>
			<tr>
				<td>Title</td>
				<td>Rating</td>
				<td>Action</td>
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${allSongs}" var="song">
				<tr>
					<td><a href="/song/${song.id}">${song.title}</a></td>
					<td>${song.rating}</td>
					<td>
					<form method="post" action="/delete/${song.id}">
					<input type="hidden" name="_method" value="Delete"/>
					<button class="btn btn-danger">Delete</button>
					</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>