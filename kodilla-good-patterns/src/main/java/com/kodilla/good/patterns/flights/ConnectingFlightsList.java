package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConnectingFlightsList {
    Set<ConnectingFlights> connectingFlightsList = new HashSet<>();

    public ConnectingFlightsList() {
    }

    public Set<ConnectingFlights> getConnectingFlightsList() {
        return connectingFlightsList;
    }

    public void addConnectingFlightsList(ConnectingFlights connectingFlights) {
        this.connectingFlightsList.add(connectingFlights);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConnectingFlightsList that)) return false;
        return Objects.equals(getConnectingFlightsList(), that.getConnectingFlightsList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConnectingFlightsList());
    }

}

