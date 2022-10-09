package com.kodilla.exception.test;

public class AirportService {
    public static void main(String[] arts) {
        FindFlight findFlight = new FindFlight();
        Flight flight = new Flight("Rome", "London");
        //Flight flight = null;

        if (flight != null) {
            try {
                findFlight.findFlight(flight);
            } catch (RouteNoFoundException err) {
                System.out.println(err);
            }
        }else{
            System.out.println("Flight is null");
        }
    }
}
