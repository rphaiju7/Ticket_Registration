<%--
  Created by IntelliJ IDEA.
  User: Rubesh
  Date: 7/22/2021
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flight Status</title>
</head>
<body bgcolor="#5C0632">
<h2 align="center">Check Qatar Airways Flight Status using flight number</h2>
<%--<h1 align="center"><img src = "flightstatusflightno.jpg" alt="Qatar Airways"></h1>--%>
<form action = "statusNo" method = "post">
  <h3 align= "center">Flight Number<input type="text" name ="flightNo"></h3>
  <h3 align= "center"><input type="Submit" name ="Check"></h3>
</form>
</body>
</html>
