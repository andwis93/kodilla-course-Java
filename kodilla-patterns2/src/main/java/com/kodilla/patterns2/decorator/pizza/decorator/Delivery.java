package com.kodilla.patterns2.decorator.pizza.decorator;

import com.kodilla.patterns2.decorator.pizza.interfaces.CreateMeal;
import java.math.BigDecimal;
import java.util.List;

public class Delivery extends AbstractMealDecorator{
    public Delivery(CreateMeal creatMeal) {
        super(creatMeal);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public List<String> getDescription() {
        List<String> descriptionList = super.getDescription();
        descriptionList.add(" * Delivery");
        return descriptionList;
    }
}
