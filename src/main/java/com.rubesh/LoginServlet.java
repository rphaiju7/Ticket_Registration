package com.rubesh;

import com.rubesh.beans.Userinfo;
import com.rubesh.service.UserLoginService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet  extends HttpServlet {
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName= request.getParameter("userName");
        String userPass= request.getParameter("userPass");
//        Userinfo u=new Userinfo();
        UserLoginService userLoginService = new UserLoginService();
        PrintWriter out= response.getWriter();
        if(userLoginService.checkUser(userLoginService.getUserNames(userName),userName,userPass))
        {
            out.println("Successful login");

        }
        else{
            out.println("Sorry!! Please enter the correct username and password.");
        }
    }
}
