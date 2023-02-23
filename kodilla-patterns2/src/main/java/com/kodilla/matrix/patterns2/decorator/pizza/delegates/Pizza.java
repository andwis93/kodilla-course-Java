package com.kodilla.matrix.patterns2.decorator.pizza.delegates;

import com.kodilla.matrix.patterns2.decorator.pizza.interfaces.CreateMeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pizza implements CreateMeal {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public List<String> getDescription() {
        List<String> list = new ArrayList<>();
        list.add("Pizza with: ");
        return list;
    }
}
