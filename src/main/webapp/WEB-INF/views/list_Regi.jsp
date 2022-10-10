<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/retrieveStyle.css">

<title>registration</title>
</head>
<body>
	<h2>All Registration</h2>
	<table id="customers">
		<thead>
			<tr>
				<th>Name</th>
				<th>City</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
		</thead>
		<%
		ResultSet res = (ResultSet) request.getAttribute("result");
		while (res.next()) {
		%>
		<tbody>
			<tr>
				<td><%=res.getString(1)%></td>
				<td><%=res.getString(2)%></td>
				<td><%=res.getString(3)%></td>
				<td><%=res.getString(4)%></td>
				<td><a href="delete?emailId=<%=res.getString(3)%>">Delete</a></td>
				<td><a
					href="update?emailId=<%=res.getString(3)%>&mobile=<%=res.getString(4)%>">Update</a></td>
			</tr>

		</tbody>

		<%
		}
		%>
	</table>
</body>
</html>