package com.example.factorymethod.shapes;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        if (side >= 0) {
            this.side = side;
        } else {
            System.out.println("Side cannot be negative.");
            this.side = 0;
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double newSide) {
        if (newSide >= 0) {
            side = newSide;
        } else {
            System.out.println("Side cannot be negative.");
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of square: " + side * side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of square: " + 4 * side);
    }
}
