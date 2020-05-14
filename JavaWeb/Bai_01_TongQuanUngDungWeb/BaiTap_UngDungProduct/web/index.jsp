<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/11/2020
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<fieldset>

    <legend>Discount Calculator</legend>
    <form action="/discount" method="post">
        <h2>Product Discount Calculator</h2>

        <table border="1">

            <tr>
                <td><label for="description">Product Description: </label></td><td><input type="text" id="description" name="description"/></td>
            </tr>
            <tr>
                <td><label for="abc">List Price: </label></td><td><input type="text" id="abc" name="price"/></td>
            </tr>
            <tr>
                <td><label for="cdf">Discount Percent: </label></td><td><input type="text" id="cdf" name="discount"/>(%)</td>
            </tr>
            <tr>
                <td><input type="submit" id="submit" value="Calculate Discount"/></td>
            </tr>
            <%--    Product Description: <input type="text" name="description"/><br/>--%>
            <%--    List Price: <input type="text" name="price"/><br/>--%>
            <%--    Discount Percent: <input type="text" name="discount"/>(%)<br/>--%>

        </table>
    </form>
</fieldset>
</body>
</html>
