<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<font color='green'>${msg}</font>

<h1>User Form</h1>

<form action ="user" method="POST"></form>
<table>

<tr>
   <td>Name:</td>
   <td><input type="text" name="name"></td>
</tr>
<tr>
   <td>Email:</td>
   <td><input type="email" name="email"></td>
</tr>
<tr>
   <td>Phno:</td>
   <td><input type="number" name="phno"></td>
</tr>
<tr>
   <td></td>
   <td><input type="submit" name="submit"></td>
</tr>

</table>

</body>
</html>