<%--
  Created by IntelliJ IDEA.
  User: 11498
  Date: 05/06/2021
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is the uoloud JSP</title>
</head>
<body>
<h3 select a image to uploud></h3>
<form action="uploudServlet" method="post" enctype="multipart/form-data">
    <input type = "file" name = "image2" size = "50" />
    <input type="text" name="imagename" size="60">
    <br/>
    <input type="submit" value="uploud file">
</form>


</body>
</html>
