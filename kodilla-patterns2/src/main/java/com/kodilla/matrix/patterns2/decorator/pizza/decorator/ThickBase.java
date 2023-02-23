package com.kodilla.matrix.patterns2.decorator.pizza.decorator;

import com.kodilla.matrix.patterns2.decorator.pizza.interfaces.CreateMeal;

import java.math.BigDecimal;
import java.util.List;

public class ThickBase extends AbstractMealDecorator{
    public ThickBase(CreateMeal creatMeal) {
        super(creatMeal);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }
    @Override
    public List<String> getDescription() {
        List<String> descriptionList = super.getDescription();
        descriptionList.add(" * Thick Base");
        return descriptionList;
    }
}
