<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/UpdateSyle.css">
<title>Update Registration</title>
</head>
<body>
	<form action="update" method="post">
		<div class="container">
			<h3>Update Registration</h3>
			<p>Please update your details.</p>
			<hr>
			<label><b>Email</b></label> <input type="text" name="email"
				value="<%=request.getAttribute("email")%>" />
				<label><b>Email</b></label>
			<input type="text" name="mobile"
				value="<%=request.getAttribute("mobile")%>" />

			<hr>
			<button type="submit" class="updatebtn">Update</button>
		</div>

	</form>
</body>
</html>