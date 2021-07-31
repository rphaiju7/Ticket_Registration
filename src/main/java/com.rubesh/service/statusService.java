package com.rubesh.service;

import com.rubesh.beans.Flightinfo;
import com.rubesh.beans.Userinfo;
import com.rubesh.dao.Flightdao;
import com.rubesh.dao.Logindao;

import java.util.List;

public class statusService {
    Flightdao flightdao=new Flightdao();

    public Flightinfo getflight(String start, String destination, String departureDate, String arrivalDate) {
        // fetch the data from database
        List<Flightinfo> allUsers = flightdao.getFlight();
        for (Flightinfo flightinfo :
                allUsers) {
            if (flightinfo.getStart().equalsIgnoreCase(start)&&flightinfo.getDestination().equalsIgnoreCase(destination)
            && flightinfo.getDepartureDate().equals(departureDate)&& flightinfo.getArrivalDate().equals(arrivalDate))
                return flightinfo;
        }
        return null;
    }

    public boolean checkUser(Flightinfo f, String start, String destination) {
        if (f != null) {
            if (f.getStart().equalsIgnoreCase(start) && f.getDestination().equalsIgnoreCase(destination) )
                return true;
        }
        return false;
    }
}
