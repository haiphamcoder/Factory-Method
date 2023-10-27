package com.example.factorymethod.factories;

import com.example.factorymethod.shapes.Rectangle;
import com.example.factorymethod.shapes.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape(double... values) {
        return new Rectangle(values[0], values[1]);
    }
}
