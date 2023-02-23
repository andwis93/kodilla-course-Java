package com.kodilla.matrix.good.patterns.flights;

import java.util.Objects;

public class ConnectingFlights {
    Flight flight1;
    Flight flight2;

    public ConnectingFlights(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    public Flight getFlight1() {
        return flight1;
    }

    public Flight getFlight2() {
        return flight2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConnectingFlights that)) return false;
        return Objects.equals(getFlight1(), that.getFlight1()) && Objects.equals(getFlight2(), that.getFlight2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlight1(), getFlight2());
    }

    @Override
    public String toString() {
        return  "First flight: \n"
                + flight1 +
                "\nSecond flight: \n"
                + flight2;
    }
}

