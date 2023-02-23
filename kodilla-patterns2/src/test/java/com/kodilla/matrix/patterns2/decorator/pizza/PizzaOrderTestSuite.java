package com.kodilla.matrix.patterns2.decorator.pizza;

import com.kodilla.matrix.patterns2.decorator.pizza.decorator.Delivery;
import com.kodilla.matrix.patterns2.decorator.pizza.decorator.Ingredients;
import com.kodilla.matrix.patterns2.decorator.pizza.decorator.Sauce;
import com.kodilla.matrix.patterns2.decorator.pizza.decorator.ThickBase;
import com.kodilla.matrix.patterns2.decorator.pizza.delegates.Pizza;
import com.kodilla.matrix.patterns2.decorator.pizza.interfaces.CreateMeal;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testOrderPizzaWithIngredientsDeliverySauceThickBase() {
        //Given
        CreateMeal createMeal = new Pizza();
        createMeal = new Ingredients(createMeal);
        createMeal = new Ingredients(createMeal);
        createMeal = new Ingredients(createMeal);
        createMeal = new Delivery(createMeal);
        createMeal = new Sauce(createMeal);
        createMeal = new ThickBase(createMeal);

          for(String s: createMeal.getDescription()){
              System.out.println(s);
          }
        System.out.println("Total: " + createMeal.getCost() + "PLN");

        //When
        int descriptionSize = createMeal.getDescription().size();
        BigDecimal cost =  createMeal.getCost();
        String deliveryDescription = createMeal.getDescription().get(4);
        String sauceDescription = createMeal.getDescription().get(5);
        String thickBaseDescription = createMeal.getDescription().get(6);

        //Then
        assertEquals(7, descriptionSize);
        assertEquals(new BigDecimal(42), cost);
        assertEquals(" * Delivery", deliveryDescription);
        assertEquals(" * Sauce", sauceDescription);
        assertEquals(" * Thick Base", thickBaseDescription);
    }
}
