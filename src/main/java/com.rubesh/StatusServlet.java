package com.rubesh;

import com.rubesh.beans.Flightinfo;
import com.rubesh.dao.Flightdao;
import com.rubesh.service.statusService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/status")
public class StatusServlet  extends HttpServlet {
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String start= (request.getParameter("start"));
        String destination= (request.getParameter("destination"));
        String departureDate= (request.getParameter("departureDate"));
        String arrivalDate= (request.getParameter("arrivalDate"));

        statusService statusServ = new statusService();
        PrintWriter out= response.getWriter();
        Flightdao dao = new Flightdao();
        List<Flightinfo> list =dao.getFlight();
        Flightinfo f = new Flightinfo();

        if(statusServ.checkUser(statusServ.getflight(start, destination,departureDate,arrivalDate),start,destination))

        {
            for (Flightinfo flightinfo:
                    list ) {

                out.println("<html>");
                out.println("<b>");
                if (flightinfo.getStart().equalsIgnoreCase(start) && flightinfo.getDestination().equalsIgnoreCase(destination) && flightinfo.getArrivalDate().equals(arrivalDate) && flightinfo.getDepartureDate().equals(departureDate) )
                {
                    out.println("Flight number :"+flightinfo.getFlightNo());
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