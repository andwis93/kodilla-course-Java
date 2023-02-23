package com.kodilla.matrix.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figure = new ArrayList<>();

    public ShapeCollector()
    {

    }

    public void addFigure(Shape shape)
    {
        figure.add(shape);
    }

    public boolean removeFigure(Shape shape)
    {
        boolean result = false;
        if (figure.contains(shape))
        {
            figure.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n)
    {
        return figure.get(n);
    }

    public String showFigures()
    {
        String names = figure.get(0).getShapeName();
        for(int i=1; i<figure.size(); i++)
        {
            names = names + ", " +figure.get(i).getShapeName();
        }
        return names;
    }

    public int getFigureQuantity()
    {
        return figure.size();
    }
}

