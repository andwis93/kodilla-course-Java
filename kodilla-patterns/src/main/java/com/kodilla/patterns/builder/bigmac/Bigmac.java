package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String breadType;
    private final int burgers;
    private final String sauceType;
    private final List<String> ingredients;

    private Bigmac(String breadType, int burgers, String sauceType, List<String> ingredients) {
        this.breadType = breadType;
        this.burgers = burgers;
        this.sauceType = sauceType;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private String breadType;
        private int burgers;
        private String sauceType;
        private final List<String> ingredients = new ArrayList<>();

        public BigmacBuilder BreadType (String breadType) {
            this.breadType = breadType;
            return this;
        }

        public BigmacBuilder Burgers (int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder SauceType (String sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(breadType, burgers, sauceType,ingredients);
        }

    }

    public String getBreadType() {
        return breadType;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauceType() {
        return sauceType;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac: \n" +
                "1. [Bread type] = " + breadType +
                "\n2. [Amount of burgers] = " + burgers +
                "\n3. [Sauce type] = " + sauceType +
                "\n4. [Ingredients] = " + ingredients;
    }

}
