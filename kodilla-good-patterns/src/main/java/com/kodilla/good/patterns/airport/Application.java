package com.kodilla.good.patterns.airport;


public class Application {

    FlightService flightService = new FlightService();


    public static void main(String[] args) throws java.lang.Exception {

        FlightService flightService = new FlightService();

        String city1 = "Madrit";
        String departureSearch = flightService.findDeparture(city1).toString();

        System.out.println("Departure to city " + city1 + " --conection:" + departureSearch);

        String city2 = "Berlin";

        String arrivalSearch = flightService.findArrival(city2).toString();

        System.out.println("Arrival from city : " + city2 + " --connection:"   + arrivalSearch);

        String city3 = "LosAngeles";

        System.out.println(flightService.beetweenF(city3));

    }

}
