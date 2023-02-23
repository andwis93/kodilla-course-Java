package com.kodilla.matrix.testing.shape;


import java.util.Objects;

public class Square implements Shape
{

    private double sideLength;

    public Square(double sideLength)
    {
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName()
    {
        return "Square";
    }

    @Override
    public double getField()
    {
        return sideLength * sideLength;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Square square)) return false;

        Square that = (Square) o;

        return (getField() == that.getField()) && (getShapeName().equals(that.getShapeName()));
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(sideLength);
    }
}
