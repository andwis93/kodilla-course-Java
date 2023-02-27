package com.kodilla.good.patterns.challenges.payingmethod;

public class PayingCreditCard implements PayingMethod {
    @Override
    public boolean payingCompleted(double price) {
        return true;
    }
}
