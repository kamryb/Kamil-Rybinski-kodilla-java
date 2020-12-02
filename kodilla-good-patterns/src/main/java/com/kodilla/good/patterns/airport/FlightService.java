package com.kodilla.good.patterns.airport;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    private Flight flight1 = new Flight("Moskwa", "LosAngeles");
    private Flight flight2 = new Flight("LosAngeles", "Berlin");
    private Flight flight3 = new Flight("London", "New");
    private Flight flight4 = new Flight("Madrit", "Lodz");
    private Set<Flight> flights = new HashSet<>();

    public Set<Flight> getFlights(){
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        return flights;
    }

    public String findDeparture(String city){
        Set<Flight> fD =  getFlights().stream()
                .filter(f -> f.getDeparture().equals(city))
                .collect(Collectors.toSet());
        return "dep city: " + city+ " - flight --> " + fD.toString();
    }

    public String findArrival(String city){
        Set<Flight> fA = getFlights().stream()
                .filter(f->f.getArrival().equals(city))
              .collect(Collectors.toSet());
        return "arr city: " + city+ " - flight <-- " + fA.toString();
    }

    public  String beetweenF(String city3){
        String otherAirportSearch1 = findDeparture(city3).toString();
        String otherAirportSearch2 = findArrival(city3).toString();
         return "Other search beetwen "  + city3 + ": " + otherAirportSearch1 + " -- " + otherAirportSearch2 ;

    }
    
    public String beetweenF3(String cityIn, String cityMd, String cityEn){
        Set<Flight> flight1 = getFlights().stream()
                .filter(f->f.getArrival().equals(cityIn) && f.getDeparture().equals(cityMd))
                .collect(Collectors.toSet());
        Set<Flight> flight2 = getFlights().stream()
                .filter(f->f.getArrival().equals(cityMd) && f.getDeparture().equals(cityEn))
                .collect(Collectors.toSet());
        return  "Start flight: " + flight1.toString() + " + middle flight " + flight2.toString();

    }
}
