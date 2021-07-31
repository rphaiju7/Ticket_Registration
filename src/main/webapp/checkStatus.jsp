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
    <title>Check Flight Status</title>
</head>
<body bgcolor="#5C0632">
<h2 align="center">Check Qatar Airways Flight Status </h2>
<%--<h1 align="center"><img src = "flightstatusflightno.jpg" alt="Qatar Airways"></h1>--%>
<form action = "status" method = "post">
    <h3 align= "center">Starting Airport: <select name ="start" id ="start">
        <option value="JFK">JFK</option>
        <option value="TIA">TIA</option>
        <option value="DOHA">DOHA</option>
        <option value="PHI">PHI</option>
        <option value="DFW">DFW</option>
    </select>
    </h3>
    <h3 align= "center">Destination Airport: <select name ="destination" id ="destination">
        <option value="VIR">VIR</option>
        <option value="DOHA">DOHA</option>
        <option value="PHI">PHI</option>
        <option value="DFW">DFW</option>
        <option value="JFK">JFK</option>
    </select>
    </h3>
    <h3 align= "center">Departure Date: <input type="date" name ="departureDate"></h3>
    <h3 align= "center">Arrival Date: <input type="date" name ="arrivalDate"></h3>
    <h3 align= "center">Price: <input type="text" name ="price"></h3>


    <h3 align= "center"><input type="Submit" name ="Check"></h3>
</form>
</body>
</html>
