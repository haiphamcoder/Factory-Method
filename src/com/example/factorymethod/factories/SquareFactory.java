package com.example.factorymethod.factories;

import com.example.factorymethod.shapes.Shape;
import com.example.factorymethod.shapes.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape(double... values) {
        return new Square(values[0]);
    }
}
