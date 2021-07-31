package com.rubesh.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

    @Entity
    @Table(name = "flights")
    public class Flightinfo {

        @Id
        @Column(name = "flightNo")
        private int flightNo;

        @Column(name = "start")
        private String start;

        @Column(name = "destination")
        private String destination;

        @Column(name = "departureDate")
        private String departureDate;

        @Column(name = "arrivalDate")
        private String arrivalDate;

        @Column(name = "price")
        private int price;


        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }



        public int getFlightNo() {
            return flightNo;
        }

        public void setFlightNo(int flightNo) {
            this.flightNo = flightNo;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDepartureDate() {
            return departureDate;
        }

        public void setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
        }

        public String getArrivalDate() {
            return arrivalDate;
        }

        public void setArrivalDate(String arrivalDate) {
            this.arrivalDate = arrivalDate;
        }
    }