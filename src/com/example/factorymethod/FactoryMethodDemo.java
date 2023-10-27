package com.example.factorymethod;

import com.example.factorymethod.factories.CircleFactory;
import com.example.factorymethod.factories.RectangleFactory;
import com.example.factorymethod.factories.ShapeFactory;
import com.example.factorymethod.factories.SquareFactory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.drawShape(10);
        System.out.println();

        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.drawShape(20);
        System.out.println();

        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.drawShape(10, 20);
    }
}
