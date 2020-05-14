<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="Com.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Com.Customer" %><%--

  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/11/2020
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách Khách Hàng</title>
</head>
<body>
<form action="/abc" method="get">
    <button>click</button>
</form>
<h1>Danh Sach Khach Hang</h1><br/>
<table border="1">
    <td width="200"><h2>Ten</h2></td>
    <td width="200"><h2>Ngay Sinh</h2></td>
    <td width="200"><h2>Dia Chi</h2></td>
    <td width="50"><h2>Anh</h2></td>
<%--    <%--%>
<%--        ArrayList<Customer> arrayList = new ArrayList<Customer>();--%>
<%--        arrayList.add(new Customer("Nhan", "12/12/1994", "Da Nang", "data:image/jpeg;base64,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"));--%>
<%--        arrayList.add(new Customer("Hien Ho", "10/03/1995", "Hue", "https://vnn-imgs-f.vgcloud.vn/2019/09/20/09/hien-ho-buc-xuc-khi-lien-tiep-bi-don-yeu-duong-2.jpg"));--%>
<%--        arrayList.add(new Customer("Sơn Tung MTP", "08/11/1993", "Thai Binh", "https://media-a.laodong.vn/Storage/NewsPortal/2019/11/10/765130/Son-Tung-Mtp.jpg?w=720&crop=auto&scale=both"));--%>
<%--        arrayList.add(new Customer("Maria Ozawa", "25/06/1985", "Japan", "https://lh3.googleusercontent.com/proxy/24Nl8Kcnq2Pvyawn3IYJHYceLnqxmVCw1-EJQCu2ufjXiE73OBQnjhfp-PzVYC0WHR8T0-LpppPqy10SIW0FFVhPmOoHDa6LHNmi97a7TuctWYvTFwFIPvWdnqX-FwFZld4s20dEx21_g5s"));--%>
<%--        request.setAttribute("arrayList", arrayList);--%>
<%--    %>--%>
<%--    <c:forEach var="i" begin="0" end="${arrayList.size()-1}">--%>
<%--        <tr>--%>
<%--            <td><c:out value="${arrayList.get(i).name}"/></td>--%>
<%--            <td><c:out value="${arrayList.get(i).birthday}"/></td>--%>
<%--            <td><c:out value="${arrayList.get(i).address}"/></td>--%>
<%--            <td><img src="<c:out value="${arrayList.get(i).img}"/>" width="50px" height="50px"></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>

            <c:forEach var="customer" items="${arrayList}">
            <tr>
                <td><c:out value="${customer.getName()}"></c:out></td>
                <td><c:out value="${customer.getBirthday()}"></c:out></td>
                <td><c:out value="${customer.getAddress()}"></c:out></td>
                <td><img src="<c:out value="${customer.getImg()}"></c:out>" alt=""  width="150px" height="150px"></td>
            </tr>
            </c:forEach>

</table>

</body>
</html>
