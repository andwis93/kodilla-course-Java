package com.kodilla.matrix.patterns.strategy;

import com.kodilla.matrix.patterns.strategy.predictors.ConservativePredictor;

public final class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
