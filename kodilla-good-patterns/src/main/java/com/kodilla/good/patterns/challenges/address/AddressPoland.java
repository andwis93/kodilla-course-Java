package com.kodilla.good.patterns.challenges.address;


public class AddressPoland implements Address {

    private String countryName;
    private String cityName;
    private String zipCode;
    private String streetName;

    private String buildingNumber;

    public AddressPoland(String countryName, String cityName, String zipCode, String streetName, String buildingNumber) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
    }


    @Override
    public String provideAddress() {
        return  "ul. " + streetName + " " + buildingNumber + "\n"
                + zipCode + " " + cityName + "\n"
                + countryName;
    }
}
