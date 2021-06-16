<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 3/3/21
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>String Recommended JSP</title>
</head>
<body>
<h1 This is a Jsp page></h1>
<div>
<c:forEach var="beer" items="${requestScope.styles}">
    <h2 ${beer.name}></h2>
    <h3 the date of it is:${beer.dateofbirth}></h3>
    <h4 more detail: ${beer.detail}></h4>
</c:forEach>
</div>
</body>
</html>
