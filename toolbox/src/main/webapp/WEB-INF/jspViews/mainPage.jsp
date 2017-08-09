<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/style.css" />
		<title>ToolBox</title>
	</head>
	
	<body>
		<div>
			<h1>Welcome, Here's your ToolBox</h1>
			<table>
				<thead>
				<tr>
    				<th>ID</th>
					<th>Name</th>
					<th>Category</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${allTools}" var="tool">
					<tr>
		  				<td>${tool.id}</td>
		  				<td>${tool.name}</td>
		  				<td>${tool.category}</td>
		  			</tr>
				</c:forEach>
				</tbody>
			</table>
			<br>
			<form action="toolbox.do" method="post">
				Add Tool:<br>
			 	<input type="text" name="addTool" placeholder = "name" >
			 	<input list="categories" name="addCategory"  placeholder = "category" >
			 	<input type="submit" value="Add">
			 	<br>
			 </form>
			 <form action="toolbox.do" method="post">
			 
			 	 Edit Tool:<br>
			 	<input type="text" name="editName" placeholder = "name">
			 	<input list="categories" name="editCategory"  placeholder = "category" >
				<input list="toolList" name="editId"  placeholder = "id" >
				<input type="submit" value="Edit">
			</form>
				<datalist id="categories">
				  <option value="basic tool">
				  <option value="electric tool">
				  <option value="screw">
				  <option value="nail">
				  <option value="bit">
				  <option value="measure">
				</datalist> 
			 	
				<datalist id="toolList">
					<c:forEach items="${allTools}" var="tool">
						<option value=${tool.id}>
				</c:forEach>
				</datalist>
			 	
			</form>
			<form action="toolbox.do" method="get">
				Sort by:<br>
				<input list="sortType" name="sort"  placeholder = "sortType">
				<input type="submit" value="GO">
				<datalist id="sortType">
					<option value="name">
					<option value="category">
				</datalist>
			</form>
			
			<form action="toolbox.do" method="get">
				Delete:<br>
				<input list="toolList" name="delete"  placeholder = "id" >
				<input type="submit" value="Delete">
				<datalist id="toolList">
					<c:forEach items="${allTools}" var="tool">
						<option value=${tool.id}>
				</c:forEach>
				</datalist>
			</form>
			<h2>HomeToolBox by Pawel Panicz</h2>
		</div>
	</body>
</html>