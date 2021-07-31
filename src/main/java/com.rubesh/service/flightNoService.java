package com.rubesh.service;

import com.rubesh.beans.Flightinfo;
import com.rubesh.beans.Userinfo;
import com.rubesh.dao.Flightdao;
import com.rubesh.dao.Logindao;

import java.util.List;

public class flightNoService {
        Flightdao flightdao=new Flightdao();

        public Flightinfo getflightName(int flightNo) {
            List<Flightinfo> allUsers = flightdao.getFlight();
            for (Flightinfo flightinfo :
                    allUsers) {
                if (flightinfo.getFlightNo()==(flightNo))
                    return flightinfo;
            }
            return null;
        }

        public boolean checkUser(Flightinfo f, int FlightNo) {
            if (f != null) {
                if (f.getFlightNo()== FlightNo)
                    return true;
            }
            return false;
        }
    }

