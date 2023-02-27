package com.kodilla.good.patterns.flights;

import java.util.Objects;
import java.util.Set;

public class FlightsList {
    Set<Flight> flightsList;

    public FlightsList(Set<Flight> flightsList) {
        this.flightsList = flightsList;
    }

    public Set<Flight> getFlightsList() {
        return flightsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightsList that)) return false;
        return Objects.equals(getFlightsList(), that.getFlightsList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightsList());
    }

    @Override
    public String toString() {
        return "FlightsList{" +
                "flightsList=" + flightsList +
                '}';
    }
}

