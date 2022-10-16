package com.kodilla.patterns.builder.bigmac;

public class Bread {
    public static final String BUN = "bun";
    public static final String ROLL = "roll";
    private final String typeOfBread;

    public Bread(String typeOfBread) {
         switch (typeOfBread) {
            case BUN, ROLL -> this.typeOfBread = typeOfBread;
            default -> throw new IllegalStateException("Bread should be bun or roll only");
        };
    }

}
