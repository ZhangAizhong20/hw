<%@ page import="javax.print.DocFlavor" %><%--
  Created by IntelliJ IDEA.
  User: 11498
  Date: 30/05/2021
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>This is a jsp page</title>
</head>
<body>
<img src="123">
<a href="123">Image</a>
<%
    Object name=request.getAttribute("name");

    Object d=request.getAttribute("true");
    String c=String.valueOf(d);
    String name2=(String) name;
    String password=(String) request.getAttribute("password");

    out.println(
    "your password is"+ c
+"your name is "+name2+" password os "+password
    );
%>

    <h1 name2></h1>
<br/>

<br/>
</body>
</html>
