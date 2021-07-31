package com.rubesh;

import com.rubesh.beans.Flightinfo;
import com.rubesh.dao.Flightdao;
import com.rubesh.service.flightNoService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/statusNo")
public class FlightServlet  extends HttpServlet {
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int flightNo= Integer.parseInt(request.getParameter("flightNo"));

        flightNoService flightserv = new flightNoService();
        PrintWriter out= response.getWriter();
        Flightdao dao = new Flightdao();
        List<Flightinfo> list =dao.getFlight();
        if(flightserv.checkUser(flightserv.getflightName(flightNo),flightNo))
        {
            for (Flightinfo flightinfo:
                list ) {

                out.println("<html>");
                out.println("<b>");
                if (flightinfo.getFlightNo()==flightNo){

                    out.println("Flight number :  "+flightinfo.getFlightNo());
                    out.println("<br>Start Airport :" + flightinfo.getStart());
                    out.println("<br>Destination Airport :" + flightinfo.getDestination());
                    out.println("<br>The Departure Date :" + flightinfo.getDepartureDate());
                    out.println("<br>The Arrival Date :" + flightinfo.getArrivalDate());
                    out.println("<br>Price $:" + flightinfo.getPrice());
//                    out.println("</b>");
//                    out.println("</html>");

                }
            }

        }
//        out.println("<html>");
//        out.println("<b>");
        else{

            out.println("<html> <b>Sorry!! The flight that you are looking for, is currently unavailable.</b></html> ");

        }
//        out.println("</b>");
//        out.println("</html>");



    }
}