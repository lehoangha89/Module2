<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/15/2020
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy Tính Đơn Giản</title>
</head>
<body>
<form action="/ketqua" method="post">
    <h1>Calculator</h1>

    <input type="text" name="number1" value="${so1}" >
    <input type="text" name="number2" value="${so2}">
    <input type="submit" name="cal" value="Addition(+)" >
    <input type="submit" name="cal" value="Subtraction(-)">
    <input type="submit" name="cal" value="Multiplication(*)">
    <input type="submit" name="cal" value="Division(/)">
    <h1>${calculator}</h1>


</form>
</body>
</html>
