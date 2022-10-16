package com.kodilla.patterns.builder.bigmac;

public class Burgers {
    public static final int SINGLE = 1;
    public static final int DOUBLE  = 2;
    public static final int TRIPLE = 3 ;
    private final int qtyOfBurgers;

    public Burgers(int qtyOfBurgers) {
        switch (qtyOfBurgers) {
            case SINGLE, DOUBLE,TRIPLE -> this.qtyOfBurgers = qtyOfBurgers;
            default -> throw new IllegalStateException("Qty of burgers should be in range 1-3 only");
        }
    }

}
