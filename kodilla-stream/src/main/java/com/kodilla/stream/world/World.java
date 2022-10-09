package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final String continentName;
    private final Set<Country> listOfCountries;
    private final Set<World> worldList = new HashSet<>();

    public World(String continentName, Set<Country> listOfCountries) {
        this.continentName = continentName;
        this.listOfCountries = listOfCountries;
    }

    public void addContinent(World world){
        worldList.add(world);
    }

    public boolean removeContinent(World world){
        return worldList.remove(world);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getListOfCountries() {
        return listOfCountries;
    }

    public Set<World> getWorldList() {
        return worldList;
    }
    public BigDecimal getPeopleQuantity(Set<World> worldList){

        return worldList.stream()
                .flatMap(world -> world.getListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));
    }
}

