<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body bgcolor="pink">
<center>
<form action="login.do" method="post">
<input name="action" value="login" type="hidden">
<input placeholder="Enter User Name" name="uname" type="text">
<input placeholder="Enter Password" name="upass" type="password">
<input type="submit" value="login">


</form>
</center>

</body>
</html>