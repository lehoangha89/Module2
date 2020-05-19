<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/15/2020
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" items="${ketqua}">
    <h1>${i}</h1>
</c:forEach>
</body>
</html>
