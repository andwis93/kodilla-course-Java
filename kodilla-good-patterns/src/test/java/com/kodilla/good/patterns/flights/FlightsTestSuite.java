package com.kodilla.good.patterns.flights;

import org.junit.jupiter.api.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@DisplayName("TDD: TicTacToe Test Suite")

public class FlightsTestSuite {
    private static int testCounter = 0;
    private static Set<Flight> flightsList = new HashSet<>();

    @BeforeAll
    public static void beforeAllTests() {
        Departure departure1 = new Departure("Warsaw",2022,11,17,14,15);
        Arrival arrival1 = new Arrival("Cracow",2022,11,17,15,35);
        Departure departure2 = new Departure("Cracow",2022,12,29,18,25);
        Arrival arrival2 = new Arrival("Gdansk",2022,11,17,19,35);
        Flight flight1 = new Flight(777,departure1,arrival1);
        Flight flight2 = new Flight(778,departure2,arrival2);
        flightsList.add(flight1);
        flightsList.add(flight2);
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute test #: " + testCounter);
    }

    @AfterEach
    public void afterEachTest()
    {
        System.out.println("Test#: " + testCounter + " was executed.");
    }

    @Nested
    @DisplayName("Finding flights")
    class findingFlights {

        @Test
        void findingFlightsFromTest() {

            //Give
            FindingFlights findingFlights = new FindingFlights();

            //When
            List<Flight> flight =  findingFlights.findingFlightsFrom(flightsList, "Cracow").stream().toList();
            String departureName = flight.get(0).getDeparture().flyingFrom;

            //Then
            Assertions.assertEquals("Cracow", departureName);
        }

        @Test
        void findingFlightsToTest() {

            //Give
            FindingFlights findingFlights = new FindingFlights();

            //When
            List<Flight> flight =  findingFlights.findingFlightsTo(flightsList, "Gdansk").stream().toList();
            String destinationName = flight.get(0).getArrival().getFlyingTo();

            //Then
            Assertions.assertEquals("Gdansk", destinationName);
        }

        @Test
        void findingFlightsFromToTest() {

            //Give
            FindingFlights findingFlights = new FindingFlights();

            //When
            List<Flight> flight =  findingFlights.findingFlightsFromTo(flightsList, "Warsaw","Cracow").stream().toList();
            String departureName = flight.get(0).getDeparture().getFlyingFrom();
            String destinationName = flight.get(0).getArrival().getFlyingTo();

            //Then
            Assertions.assertEquals("Warsaw", departureName);
            Assertions.assertEquals("Cracow", destinationName);
        }

        @Test
        void findingFlightsThruTest() {

            //Give
            FindingFlights findingFlights = new FindingFlights();

            //When
            List<ConnectingFlights> flight =  findingFlights.findingFlightsThru(flightsList, "Warsaw","Cracow","Gdansk",100000).stream().toList();
            String firstDepartureName = flight.get(0).flight1.getDeparture().getFlyingFrom();
            String firstDestinationName = flight.get(0).flight1.getArrival().getFlyingTo();
            String secondDepartureName = flight.get(0).flight2.getDeparture().getFlyingFrom();
            String destinationName = flight.get(0).flight2.getArrival().getFlyingTo();

            //Then
            Assertions.assertEquals("Warsaw", firstDepartureName);
            Assertions.assertEquals("Cracow", firstDestinationName);
            Assertions.assertEquals("Cracow", secondDepartureName);
            Assertions.assertEquals("Gdansk", destinationName);
        }

        @Test
        void findingFlightsThruNoFlightTest() {

            //Give
            FindingFlights findingFlights = new FindingFlights();

            //When
            List<ConnectingFlights> flight =  findingFlights.findingFlightsThru(flightsList, "Warsaw","Cracow","Gdansk",24).stream().toList();
            int flightFound = flight.size();

            //Then
            Assertions.assertEquals(0, flightFound);
        }
    }
}
