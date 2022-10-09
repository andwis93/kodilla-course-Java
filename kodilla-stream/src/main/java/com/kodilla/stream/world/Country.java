package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String name;
    private final int peopleQuantity;

    public Country(String name, int peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return new BigDecimal(peopleQuantity);
    }

    @Override
    public String toString() {
        return name.toUpperCase() + " has " + peopleQuantity +" population";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country country)) return false;
        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

