package com.rubesh;
import com.rubesh.beans.Userinfo;
import com.rubesh.dao.Registerdao;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/newacc")
public class newaccountServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Userinfo userinfo = new Userinfo();
        userinfo.setUserID(Integer.parseInt(request.getParameter("userId")));
        userinfo.setUserName(request.getParameter("username"));
        userinfo.setFirstName(request.getParameter("fName"));
        userinfo.setLastName(request.getParameter("lName"));
        userinfo.setGender(request.getParameter("gender"));
        userinfo.setAge(Integer.parseInt(request.getParameter("age")));
        userinfo.setEmail(request.getParameter("email"));
        userinfo.setPhone(request.getParameter("phone"));
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
        if(pass1.equals(pass2)){
            userinfo.setPassword(pass1);
        }
        else
        {
            System.out.println("<html><b>Password does not Match! Please try again. </b></html>");
            System.exit(0);
        }
        Registerdao reg = new Registerdao();
        reg.connection(userinfo);
        PrintWriter out = response.getWriter();
        out.println("<html><b> Your information has been saved successfully. </b></html>");

    }
}
