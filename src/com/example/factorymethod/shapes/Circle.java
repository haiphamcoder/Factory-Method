package com.example.factorymethod.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
            this.radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle: " + Math.PI * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of circle: " + 2 * Math.PI * radius);
    }
}
