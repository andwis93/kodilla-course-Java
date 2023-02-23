package com.kodilla.matrix.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent Europe = new Continent();
        Continent Asia = new Continent();
        Continent Africa = new Continent();

        World europe = new World("Europe", Europe.getCountriesList());
        World asia = new World("Asia", Asia.getCountriesList());
        World africa = new World("Africa", Africa.getCountriesList());

        Set<World> theWorldList = new HashSet<>();

        World world = new World("Unknown", new HashSet<>());

        //When
        Europe.addCountry(new Country("Poland", 37950000));
        Europe.addCountry(new Country("Germany", 83240000));
        Europe.addCountry(new Country("France", 67390000));
        Europe.addCountry(new Country("Italy", 59550000));
        Europe.addCountry(new Country("Spain", 47350000));
        Europe.addCountry(new Country("Great Britain", 67220000));

        Asia.addCountry(new Country("Japan", 125800000));
        Asia.addCountry(new Country("China", 1402000000));
        Asia.addCountry(new Country("Singapore", 5686000));
        Asia.addCountry(new Country("India", 1380000000));
        Asia.addCountry(new Country("Thailand", 69800000));
        Asia.addCountry(new Country("Bangladesh", 164700000));

        Africa.addCountry(new Country("Nigeria", 206100000));
        Africa.addCountry(new Country("Kenia", 53770000));
        Africa.addCountry(new Country("Senegal", 16740000));
        Africa.addCountry(new Country("Mali", 20250000));
        Africa.addCountry(new Country("Ghana", 31070000));

        theWorldList.add(new World("Europe", Europe.getCountriesList()));
        theWorldList.add(new World("Asia", Asia.getCountriesList()));
        theWorldList.add(new World("Africa", Africa.getCountriesList()));

        BigDecimal totalPeopleOnTheWorld = world.getPeopleQuantity(theWorldList);

        //Then
        BigDecimal expectedPeople = new BigDecimal("3838616000");
        assertEquals(expectedPeople,totalPeopleOnTheWorld);
    }
}

