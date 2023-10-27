package com.example.factorymethod.factories;

import com.example.factorymethod.shapes.Circle;
import com.example.factorymethod.shapes.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape(double... values) {
        return new Circle(values[0]);
    }
}
