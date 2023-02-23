package com.kodilla.matrix.testing.shape;


import java.util.Objects;

public class Triangle implements Shape
{
    private double baseLength;
    private double height;

    public Triangle(double baseLength, double height)
    {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public String getShapeName()
    {
        return "Triangle";
    }

    @Override
    public double getField()
    {
        return (baseLength * height)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Triangle triangle)) return false;

        Triangle that = (Triangle) o;

        return (getField() == that.getField()) && (getShapeName().equals(that.getShapeName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseLength, height);
    }
}
