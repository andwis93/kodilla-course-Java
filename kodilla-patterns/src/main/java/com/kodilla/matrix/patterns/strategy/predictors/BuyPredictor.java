package com.kodilla.matrix.patterns.strategy.predictors;

public sealed interface BuyPredictor
        permits AggressivePredictor, BalancedPredictor, ConservativePredictor {

    String predictWhatToBuy();
}
