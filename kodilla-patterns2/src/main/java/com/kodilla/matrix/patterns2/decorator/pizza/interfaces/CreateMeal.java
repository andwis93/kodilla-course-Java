package com.kodilla.matrix.patterns2.decorator.pizza.interfaces;

import java.math.BigDecimal;
import java.util.List;

public interface CreateMeal {
    BigDecimal getCost();
    List<String> getDescription();
}
