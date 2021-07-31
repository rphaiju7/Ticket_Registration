<%--
  Created by IntelliJ IDEA.
  User: Rubesh
  Date: 7/21/2021
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new account</title>

</head>
<%--<body background-image: url("background.jpg");--%>
<%-->--%>
<body bgcolor="#5C0632">
<form action="newacc" method="post">
    <h1 align="center">Let travel lead your imagination with Qatar Airways</h1>
    <h1 align="center">Welcome to Qatar Airlines</h1>
    <h1 align="center"><img src="newaccount.png" width="800" height="350" alt="Qatar Airways"></h1>
    <h1 align="center">Create your account here</h1>
    <h3 align="center">Enter your userID: <input type="text" name="userId"><br>
        <h3 align="center">Enter your username: <input type="text" name="username"><br>
            <h3 align="center">Enter your password: <input type="password" name="pass1">
                <h3 align="center">Confirm your password: <input type="password" name="pass2"><br>
                    <h3 align="center">Enter your first name: <input type="text" name="fName"><br>
                        <h3 align="center">Enter your last name: <input type="text" name="lName"><br>
                            <h3 align="center">Your Gender : Male <input type="radio" name="gender" value="male"> Female<input
                                    type="radio" name="gender" value="female"><br>
                                <h3 align="center">Enter your age: <input type="text" name="age"><br>
                                    <h3 align="center">Enter your email address: <input type="text" name="email"><br>
                                        <h3 align="center">Enter your phone: <input type="text" name="phone"><br>
                                            <h3 align="center"><input type="submit" name="Submit">
</form>
</body>
</html>
