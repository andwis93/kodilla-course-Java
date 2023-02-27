package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNoFoundException {

        Map<String, Boolean> theAirportList = new HashMap<>();
        theAirportList.put("Warsaw", false);
        theAirportList.put("Barcelona", true);
        theAirportList.put("London", false);
        theAirportList.put("New York", true);

        List<String> flightList = new ArrayList<>();
        flightList.add(flight.getArrivalAirport());
        flightList.add(flight.getDepartureAirport());

        for (String theFlight : flightList) {
            if (theAirportList.get(theFlight) != null) {
                if (theAirportList.get(theFlight)) {
                    System.out.println("You CAN fly to: " + theFlight);
                } else {
                    System.out.println("You can NOT fly to: " + theFlight);
                }
            } else {
                throw new RouteNoFoundException(theFlight + " in not on airport list");
            }
        }
    }
}
