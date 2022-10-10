<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/loginStyle.css">
<title>Login Page</title>
</head>
<body>

	<form action="verifylogin" method="post">
		<h3>Login Page</h3>
		<p>Please enter your email and password.</p>
		<div class="container">
			<hr>
			<label><b>Email</b></label> <input type="text"
				placeholder="Enter Email" name="email" /> <label><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password" />

			<hr>
			<button type="submit" class="loginbtn">Login</button>
			<p>
				<%
				if (request.getAttribute("error") != null) {
					out.println(request.getAttribute("error"));
				}
				%>
			</p>
		</div>
	</form>
</body>
</html>