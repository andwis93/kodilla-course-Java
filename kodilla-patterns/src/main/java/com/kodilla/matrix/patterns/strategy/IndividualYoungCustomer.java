package com.kodilla.matrix.patterns.strategy;

import com.kodilla.matrix.patterns.strategy.predictors.AggressivePredictor;

public final class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }

}
