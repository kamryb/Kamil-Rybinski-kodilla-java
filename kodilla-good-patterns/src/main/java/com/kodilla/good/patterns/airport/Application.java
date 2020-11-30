package com.kodilla.good.patterns.airport;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Application {

    FlightService flightService = new FlightService();


    public static void main(String[] args) throws java.lang.Exception {

        FlightService flightService = new FlightService();

        String departureSearch = flightService.findDeparture("Madrit").toString();

        System.out.println("Departure search: " + departureSearch);

        String arrivalSearch = flightService.findArrival("Berlin").toString();

        System.out.println("Arrival search: " + arrivalSearch);



        String otherAirportSearch1 = flightService.findDeparture("LosAngeles").toString();
        String otherAirportSearch2 = flightService.findArrival("LosAngeles").toString();

        System.out.println("Other search beetwen LosAngeles: " + otherAirportSearch1 + " ----- " + otherAirportSearch2 );


    }



}
