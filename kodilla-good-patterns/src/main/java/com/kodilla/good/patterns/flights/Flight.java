package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    int flightNumber;
    Departure departure;
    Arrival arrival;

    public Flight(int flightNumber, Departure departure, Arrival arrival) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Arrival getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;
        return getFlightNumber() == flight.getFlightNumber() && Objects.equals(getDeparture(), flight.getDeparture()) && Objects.equals(getArrival(), flight.getArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightNumber(), getDeparture(), getArrival());
    }

    @Override
    public String toString() {
        return "Flight nr: " + flightNumber +
                "\n*" + departure +
                "\n*" + arrival ;
    }
}

