package com.kodilla.matrix.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> countriesList = new HashSet<>();

    public Continent() {
    }

    public void addCountry(Country country){
        countriesList.add(country);
    }

    public boolean removeCountry(Country country){
        return countriesList.remove(country);
    }

    public Set<Country> getCountriesList() {
        return countriesList;
    }
}

