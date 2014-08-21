<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator Home</title>
</head>
<body>
<h2>Administrator Home</h2>
<h5>Logged In User ::<%=session.getAttribute("userName") %></h5> 
<h4><a href="LogoutServlet" >Logout</a></h4>
<table>
	<tr>
		<th>Id</th>
		<th>UserName</th>
		<th>Password</th>
		<th>Action</th>
	</tr>
	<tr>
		<td>2</td>
		<td>vipul</td>
		<td>vipul</td>
		<td><a href="LoginServlet?userName=vipul&passWord=vipul&adminFlag=true">Login</a></td>
	</tr>
	<tr>
		<td>2</td>
		<td>saumil</td>
		<td>saumil</td>
		<td><a href="LoginServlet?userName=saumil&passWord=saumil&adminFlag=true">Login</a></td>
	</tr>

</table>
</body>
</html>