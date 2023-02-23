package com.kodilla.matrix.patterns2.decorator.pizza.delegates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IngredientsList {
    public String getIngredients() {
        List<String> ingredientsList = new ArrayList<>();
        ingredientsList.add("Pepperoni");
        ingredientsList.add("Extra cheese");
        ingredientsList.add("Olives");
        ingredientsList.add("Tomatoes");
        ingredientsList.add("Onion");
        ingredientsList.add("Pepper");
        ingredientsList.add("Spinach");
        ingredientsList.add("Pineapple");
        ingredientsList.add("Bacon");
        ingredientsList.add("Chicken");
        ingredientsList.add("Mushrooms");

        Random r = new Random();

        return ingredientsList.get(r.nextInt(ingredientsList.size()));
    }
}
