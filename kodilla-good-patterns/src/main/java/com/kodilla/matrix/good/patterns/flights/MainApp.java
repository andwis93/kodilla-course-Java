package com.kodilla.matrix.good.patterns.flights;

public class MainApp {

    public static void main(String[] args) {

        FlightsListGiven flightsListGiven = new FlightsListGiven();
        FlightsList flightsList = new FlightsList(flightsListGiven.flights());
        Process process = new Process();

        process.flyingFromProcess(flightsList, "Warsaw");
        process.flyingToProcess(flightsList, "Warsaw");
        process.flyingFromToProcess(flightsList,"Warsaw", "Wroclaw");
        process.flyingThruProcess(flightsList,"Warsaw","Cracow", "Gdansk",24);
    }
}
