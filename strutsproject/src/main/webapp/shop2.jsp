<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VEG SHOP</title>
<body bgcolor="yellow">
<h1>Veg Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="shop3">
<input type="radio" name="apple" value="rs50">Onion
<input type="radio" name="mango" value="rs30">Carrot
<input type="radio" name="banana" value="rs20">Tomato
<input type="submit" value="Next shop">
</form>

<jsp:include page="logout.jsp" />

</body>
</html>