package com.kodilla.matrix.patterns.strategy;

import com.kodilla.matrix.patterns.strategy.predictors.BalancedPredictor;

public final class CorporateCustomer extends Customer {

    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
