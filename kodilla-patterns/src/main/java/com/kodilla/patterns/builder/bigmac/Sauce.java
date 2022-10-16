package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "standard";
    public static final String WYSP1000 = "1000 wysp";
    public static final String BARBECUE = "barbecue";
    private final String typeOfSauce;

    public Sauce(String typeOfSauce) {
        switch (typeOfSauce) {
            case STANDARD, WYSP1000, BARBECUE -> this.typeOfSauce = typeOfSauce;
            default -> throw new IllegalStateException("Sauce should be standard, 1000 wysp or barbecue only");
        }
    }

}
