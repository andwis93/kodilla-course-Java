package com.kodilla.matrix.good.patterns.flights;

public class Process {
    FindingFlights findingFlights = new FindingFlights();

    public void flyingFromProcess(FlightsList flightsList, String departureName){
        System.out.println("\n************** Flying From ****************\n");
        for(Flight flight:findingFlights.findingFlightsFrom(flightsList.getFlightsList(), departureName)){
            System.out.println(flight);
        }
    }
    public void flyingToProcess(FlightsList flightsList, String destinationName){
        System.out.println("\n************** Flying To ****************\n");
        for(Flight flight:findingFlights.findingFlightsTo(flightsList.getFlightsList(), destinationName)) {
            System.out.println(flight);
        }
    }
    public void flyingFromToProcess(FlightsList flightsList,String departureName, String destinationName){
        System.out.println("\n************** Flying From To ****************\n");
        for(Flight flight:findingFlights.findingFlightsFromTo(flightsList.getFlightsList(),
                departureName ,
                destinationName)) {
            System.out.println(flight);
        }
    }
    public void flyingThruProcess(FlightsList flightsList,String departureName, String thruFlightName, String destinationName, int hoursDuration){
        System.out.println("\n************** Flying Thru ****************\n");

        for(ConnectingFlights flight:findingFlights.findingFlightsThru(flightsList.getFlightsList(),departureName,
                thruFlightName, destinationName,hoursDuration)) {
            System.out.println(flight);
        }
    }
}

