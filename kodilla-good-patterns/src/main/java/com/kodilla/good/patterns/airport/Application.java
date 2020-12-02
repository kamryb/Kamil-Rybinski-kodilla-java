package com.kodilla.good.patterns.airport;


public class Application {

    FlightService flightService = new FlightService();


    public static void main(String[] args) throws java.lang.Exception {

        FlightService flightService = new FlightService();

        String city1 = "Madrit";
        String departureSearch = flightService.findDeparture(city1);

        System.out.println(departureSearch);


        String city2 = "Berlin";

        String arrivalSearch = flightService.findArrival(city2);
        System.out.println(arrivalSearch);

        String cityM = "LosAngeles";
        String cityEnd = "Moskwa";
        String middleSearch = flightService.beetweenF3(city2, cityM, cityEnd);
        System.out.println(middleSearch);

    }

}
