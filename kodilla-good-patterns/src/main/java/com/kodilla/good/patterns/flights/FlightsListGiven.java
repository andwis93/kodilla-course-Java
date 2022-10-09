package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsListGiven {
    Set<Flight> flightsList = new HashSet<>();

    public Set<Flight> flights() {
        Departure departure1 = new Departure("Warsaw", 2022, 10, 12, 14, 55);
        Departure departure2 = new Departure("Warsaw", 2022, 10, 12, 9, 10);
        Departure departure3 = new Departure("Warsaw", 2022, 11, 7, 19, 50);
        Departure departure4 = new Departure("Warsaw", 2022, 12, 30, 7, 25);
        Departure departure5 = new Departure("Warsaw", 2022, 12, 30, 17, 15);
        Departure departure6 = new Departure("Cracow", 2022, 10, 12, 11, 50);
        Departure departure7 = new Departure("Cracow", 2022, 10, 12, 14, 17);
        Departure departure8 = new Departure("Cracow", 2022, 11, 14, 15, 40);
        Departure departure9 = new Departure("Cracow", 2022, 11, 30, 16, 30);
        Departure departure10 = new Departure("Cracow", 2022, 12, 18, 12, 47);
        Departure departure11 = new Departure("Wroclaw", 2022, 10, 10, 18, 11);
        Departure departure12 = new Departure("Wroclaw", 2022, 10, 12, 8, 45);
        Departure departure13 = new Departure("Wroclaw", 2022, 12, 1, 6, 05);
        Departure departure14 = new Departure("Wroclaw", 2022, 12, 15, 20, 05);
        Departure departure15 = new Departure("Wroclaw", 2022, 12, 24, 15, 25);

        Arrival arrival1 = new Arrival("Bialystok", 2022, 10, 12, 16, 00);
        Arrival arrival2 = new Arrival("Cracow", 2022, 10, 12, 10, 45);
        Arrival arrival3 = new Arrival("Kielce", 2022, 11, 7, 21, 15);
        Arrival arrival4 = new Arrival("Wroclaw", 2022, 12, 30, 8, 51);
        Arrival arrival5 = new Arrival("Radom", 2022, 12, 30, 18, 25);
        Arrival arrival6 = new Arrival("Gdansk", 2022, 10, 12, 13, 15);
        Arrival arrival7 = new Arrival("Warsaw", 2022, 10, 12, 15, 55);
        Arrival arrival8 = new Arrival("Gdynia", 2022, 11, 14, 17, 10);
        Arrival arrival9 = new Arrival("Wroclaw", 2022, 11, 30, 17, 50);
        Arrival arrival10 = new Arrival("Gdynia", 2022, 12, 18, 14, 2);
        Arrival arrival11 = new Arrival("Warsaw", 2022, 10, 12, 11, 50);
        Arrival arrival12 = new Arrival("Cracow", 2022, 10, 12, 10, 00);
        Arrival arrival13 = new Arrival("Gdansk", 2022, 12, 1, 7, 51);
        Arrival arrival14 = new Arrival("Szczecin", 2022, 12, 15, 21, 55);
        Arrival arrival15 = new Arrival("Bialystok", 2022, 12, 24, 16, 45);

        flightsList.add(new Flight(1,departure1,arrival1));
        flightsList.add(new Flight(2,departure2,arrival2));
        flightsList.add(new Flight(3,departure3,arrival3));
        flightsList.add(new Flight(4,departure4,arrival4));
        flightsList.add(new Flight(5,departure5,arrival5));
        flightsList.add(new Flight(6,departure6,arrival6));
        flightsList.add(new Flight(7,departure7,arrival7));
        flightsList.add(new Flight(8,departure8,arrival8));
        flightsList.add(new Flight(9,departure9,arrival9));
        flightsList.add(new Flight(10,departure10,arrival10));
        flightsList.add(new Flight(11,departure11,arrival11));
        flightsList.add(new Flight(12,departure12,arrival12));
        flightsList.add(new Flight(13,departure13,arrival13));
        flightsList.add(new Flight(14,departure14,arrival14));
        flightsList.add(new Flight(15,departure15,arrival15));

        return flightsList;
    }
}

