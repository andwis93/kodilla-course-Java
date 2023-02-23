package com.kodilla.matrix.patterns2.decorator.pizza.decorator;

import com.kodilla.matrix.patterns2.decorator.pizza.interfaces.CreateMeal;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractMealDecorator implements CreateMeal {
    private final CreateMeal creatMeal;

    protected AbstractMealDecorator(CreateMeal creatMeal) {
        this.creatMeal = creatMeal;
    }

    @Override
    public BigDecimal getCost() {
        return creatMeal.getCost();
    }

    @Override
    public List<String> getDescription() {
        return creatMeal.getDescription();
    }
}
