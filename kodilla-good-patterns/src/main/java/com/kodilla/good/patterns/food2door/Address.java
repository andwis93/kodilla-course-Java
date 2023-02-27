package com.kodilla.good.patterns.food2door;

public class Address {
    private String countryName;
    private String townName;
    private String zipCode;
    private String streetName;
    private String buildingNumber;

    public Address(String countryName, String townName, String zipCode, String streetName, String buildingNumber) {
        this.countryName = countryName;
        this.townName = townName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
    }
}

