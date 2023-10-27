package com.example.factorymethod.factories;

import com.example.factorymethod.shapes.Shape;

public abstract class ShapeFactory {
    public void drawShape(double... values) {
        Shape shape = createShape(values);
        shape.draw();
        shape.calculateArea();
        shape.calculatePerimeter();
    }

    public abstract Shape createShape(double... values);
}
