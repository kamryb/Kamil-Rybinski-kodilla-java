package com.kodilla.exception.test;
//import sun.font.TrueTypeFont;

import java.util.*;

public class FindFlightClass {

    Map<String, Boolean> airport = new HashMap<>();

    public FindFlightClass(){
        airport.put("Wawa", true);
        airport.put("Kat", true);
        airport.put("Olsztyn", false);
    }
    
    public boolean findFlight(Flight flight){

        if(airport.containsKey(flight.arrivalAirport)) {
            return airport.get(flight.arrivalAirport);
        }
        throw new RouteNotFoundException("No Airport");
    }

    public static void main(String[] args){
        FindFlightClass findFlight=new FindFlightClass();
        Flight flight1 =new Flight("Wawa","Kat");
        findFlight.findFlight(flight1);

    }
}
