package com.kodilla.good.patterns.airport;


import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightService {

    Flight flight1 = new Flight("Moskwa", "LosAngeles");
    Flight flight2 = new Flight("LosAngeles", "Berlin");
    Flight flight3 = new Flight("London", "New");
    Flight flight4 = new Flight("Madrit", "Lodz");
    HashSet<Flight> flights = new HashSet<>();
    private Object HashSet;

    public HashSet<Flight> getFlights(){
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        return flights;
    }

    public HashSet<Flight> findDeparture(String city){
        return (HashSet<Flight>) getFlights().stream()
                .filter(f->f.getDeparture().equals(city))
                .collect(Collectors.toSet());
               //.forEach(System.out::println);

    }
    public HashSet<Flight> findArrival(String city){
        return (HashSet<Flight>) getFlights().stream()
                .filter(f->f.getArrival().equals(city))
                .collect(Collectors.toSet());
        //.forEach(System.out::println);

    }

   // public HashSet<Flight> findOtherAirport(String city) {
      //  (HashSet<Flight>) getFlights().stream()





      /* return (HashSet<Flight>) getFlights().stream()
                .filter(two -> getFlights().stream().
                        .anyMatch((f->f.getDeparture().equals(city))&&(two.g)))

                        .collect(Collectors.toSet());
           }

*/


    //      flights.stream()
  //              .filter(f->f.getArrival().equals("Wawa"))
  //          .filter(f->f.getDepartment().equals("Los"))
  //          .collect(Collectors.toSet())
  //          .forEach(System.out::println);



}
