package com.kodilla.matrix.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Calculator {
    private final Display display;

    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double val = a+b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        double val = a-b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        double val = a*b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Can't divide by '0'");
            return 0;
        } else {
            double val = a/b;
            display.displayValue(val);
            return val;
        }
    }

}
