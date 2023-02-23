package com.kodilla.matrix.patterns2.decorator.pizza.decorator;

import com.kodilla.matrix.patterns2.decorator.pizza.delegates.IngredientsList;
import com.kodilla.matrix.patterns2.decorator.pizza.interfaces.CreateMeal;

import java.math.BigDecimal;
import java.util.List;

public class Ingredients extends AbstractMealDecorator{
    public Ingredients(CreateMeal creatMeal) {
        super(creatMeal);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }
    @Override
    public List<String> getDescription() {
        IngredientsList ingredients = new IngredientsList();
        List<String> descriptionList = super.getDescription();
        descriptionList.add(" - " + ingredients.getIngredients());
        return descriptionList;
    }
}
