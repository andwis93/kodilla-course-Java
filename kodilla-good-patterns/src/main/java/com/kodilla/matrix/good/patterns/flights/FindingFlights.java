package com.kodilla.matrix.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FindingFlights {

    public Set<Flight> findingFlightsFrom(Set<Flight> flightListSet, String flyingFrom) {
        FlightsList flightsList = new FlightsList(flightListSet);
        Set<Flight> flightsListFrom;

        flightsListFrom = flightsList.getFlightsList().stream()
                .filter(f -> f.getDeparture().getFlyingFrom().equalsIgnoreCase(flyingFrom))
                .collect(Collectors.toSet());

        return flightsListFrom;
    }

    public  Set<Flight> findingFlightsTo(Set<Flight> flightListSet, String flyingTo) {
        FlightsList flightsList = new FlightsList(flightListSet);
        Set<Flight> flightsListTo;

        flightsListTo = flightsList.getFlightsList().stream()
                .filter(f ->f.getArrival().getFlyingTo().equalsIgnoreCase(flyingTo))
                .collect(Collectors.toSet());

        return flightsListTo;
    }

    public  Set<Flight> findingFlightsFromTo(Set<Flight> flightListSet, String flyingFrom, String flyingTo) {
        FlightsList flightsList = new FlightsList(flightListSet);
        Set<Flight> flightsListFromTo;

        flightsListFromTo = flightsList.getFlightsList().stream()
                .filter(f -> (f.getDeparture().getFlyingFrom().equals(flyingFrom) && f.getArrival().getFlyingTo().equals(flyingTo)))
                .collect(Collectors.toSet());

        return flightsListFromTo;
    }

    public  Set<ConnectingFlights> findingFlightsThru(Set<Flight> flightListSet, String flyingFrom, String flyingThru, String flyingTo,int amountOfHours) {
        FlightsList flightsList = new FlightsList(flightListSet);
        CompareTime compareTime = new CompareTime();
        ConnectingFlightsList connectingFlightsList = new ConnectingFlightsList();
        ConnectingFlights connectingFlights;

        Set<Flight> tempFlightsListThru;
        Set<Flight> tempFlightsListTo;

        tempFlightsListThru = flightsList.getFlightsList().stream()
                .filter(f -> (f.getArrival().getFlyingTo().equalsIgnoreCase(flyingThru)) && (f.getDeparture().getFlyingFrom().equalsIgnoreCase(flyingFrom)))
                .collect(Collectors.toSet());

        tempFlightsListTo = flightsList.getFlightsList().stream()
                .filter(f -> (f.getDeparture().getFlyingFrom().equalsIgnoreCase(flyingThru)) && (f.getArrival().getFlyingTo().equalsIgnoreCase(flyingTo)))
                .collect(Collectors.toSet());

        for (Flight flightThru : tempFlightsListThru) {
            for(Flight flightTo : tempFlightsListTo) {
                if(compareTime.compareTime(flightThru.getArrival().getArrivalDateTime(), flightTo.getDeparture().getDepartureDateTime(),amountOfHours)) {
                    connectingFlights = new ConnectingFlights(flightThru,flightTo);
                    try {
                        connectingFlightsList.addConnectingFlightsList(connectingFlights);
                    }catch (Exception err) {
                        err.printStackTrace();
                    }
                }else {
                    System.out.println("There is no connecting flights between '" + flyingFrom +"' - '" + flyingThru + "' - '" + flyingTo  + "' in " + amountOfHours + "h period!");
                }
            }
        }
        return connectingFlightsList.getConnectingFlightsList();
    }
}

