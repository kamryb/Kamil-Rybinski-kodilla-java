package com.kodilla.good.patterns.airport;

public class Flight {
    private String arrival;
    private String departure;

    public Flight(String departure, String arrival) {

        this.departure = departure;
        this.arrival = arrival;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setDepartment(String departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!getArrival().equals(flight.getArrival())) return false;
        return getDeparture().equals(flight.getDeparture());
    }

    @Override
    public int hashCode() {
        int result = getArrival().hashCode();
        result = 31 * result + getDeparture().hashCode();
        return result;
    }
}
