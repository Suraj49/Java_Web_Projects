<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/createStyle.css">

<title>Create registration</title>
</head>
<body>

	<form action="saveReg" method="post">
		<div class="container">
			<h3>Registration Page</h3>
			<p>Please enter your details correctly.</p>
			<hr>

		<label><b>Name</b></label>
		 <input type="text" name="name" /> 
		 <label><b>City</b></label><input type="text"
				name="city" /> 
				<label><b>Email</b></label>
				<input type="text" name="email" /> 
				<label><b>Mobile</b></label>
				<input
				type="text" name="mobile" />

			<hr>
			<button type="submit" class="registerbtn">Registration</button>
			<hr>
			<p>
				<%
				if (request.getAttribute("msg") != null) {
					out.println(request.getAttribute("msg"));
				}
				%>
			</p>
		</div>
	</form>

</body>
</html>