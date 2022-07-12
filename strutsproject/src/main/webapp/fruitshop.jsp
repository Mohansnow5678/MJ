<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FRUIT SHOP</title>
</head>
<body>
<h1>Fruit Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="shop2">
<input type="radio" name="apple" value="rs4">Apple
<input type="radio" name="mango" value="rs3">Lemon
<input type="radio" name="banana" value="rs2">Banana
<input type="submit" value="Next">
</form>
<hr>
<jsp:include page="logout.jsp" />
<hr>
</body>
</html>