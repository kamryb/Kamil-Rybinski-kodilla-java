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

    public Set<Flight> findDeparture(String city){
        return getFlights().stream()
                .filter(f -> f.getDeparture().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findArrival(String city){
        return getFlights().stream()
                .filter(f->f.getArrival().equals(city))
              .collect(Collectors.toSet());
    }

    public  String beetweenF(String city3){
        String otherAirportSearch1 = findDeparture(city3).toString();
        String otherAirportSearch2 = findArrival(city3).toString();
         return "Other search beetwen "  + city3 + ": " + otherAirportSearch1 + " -- " + otherAirportSearch2 ;

    }
}
