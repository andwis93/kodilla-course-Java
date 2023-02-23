package com.kodilla.matrix.good.patterns.food2door;

public class BenefitsProvideBySupplier {
    private double rebate;
    private boolean freeDelivery;

    public BenefitsProvideBySupplier(double rebate, boolean freeDelivery) {
        this.rebate = rebate;
        this.freeDelivery = freeDelivery;
    }

    public BenefitsProvideBySupplier() {

    }

    public double getRebate() {
        return rebate;
    }

    public boolean isFreeDelivery() {
        return freeDelivery;
    }
}

