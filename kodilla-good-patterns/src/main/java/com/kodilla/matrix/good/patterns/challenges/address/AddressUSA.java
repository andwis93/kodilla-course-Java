package com.kodilla.matrix.good.patterns.challenges.address;


public class AddressUSA implements Address {

    private String countryName;
    private String stateName;
    private String cityName;
    private String zipCode;
    private String streetName;

    private String buildingNumber;

    public AddressUSA(String countryName, String stateName, String cityName, String zipCode, String streetName, String buildingNumber) {
        this.countryName = countryName;
        this.stateName = stateName;
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String provideAddress() {
        return buildingNumber + " " + stateName + "\n"
                + cityName + ", " + stateName + " " + zipCode + "\n"
                +countryName;
    }
}
