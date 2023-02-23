package com.kodilla.matrix.testing.shape;


import java.util.Objects;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String getShapeName()
    {
        return "Circle";
    }

    @Override
    public double getField()
    {
        return PI * pow(radius, 2);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Circle circle)) return false;

        Circle that = (Circle) o;

        return (getField() == that.getField()) && (getShapeName().equals(that.getShapeName()));
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(radius);
    }
}

