<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<center>
<form action="register.do" method="post">
<input name="action" value="register" type="hidden">
<input placeholder="Enter User Name" name="uname" type="text">
<input placeholder="Enter Password" name="upass" type="password">
<input type="submit" value="register">
</form>
</center>
</body>
</html>