<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/style.css" />
		<title>Login</title>
	</head>
	
	<body>
		<div id="login">
			<h2>Please log in to view list of your tools</h2>
			<h3 id="err">${error}</h3>
			<form action="login.do" method="post">
				Login:<br>
				<input type="text" name="login"><br>
				Password:<br>
			 	<input type="password" name="password"><br>
			 	<input type="submit" value="Log in">
			</form> 
			<h2>HomeToolBox by Pawel Panicz</h2>
			
		</div>
		
	</body>
</html>