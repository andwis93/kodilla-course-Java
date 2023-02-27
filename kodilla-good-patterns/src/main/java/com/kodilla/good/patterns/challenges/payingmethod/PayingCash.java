package com.kodilla.good.patterns.challenges.payingmethod;

public class PayingCash implements PayingMethod {
    @Override
    public boolean payingCompleted(double price) {
        return false;
    }
}