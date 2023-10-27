package com.example.factorymethod.shapes;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width >= 0 && height >= 0) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Width and height cannot be negative.");
            this.width = 0;
            this.height = 0;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double newWidth) {
        if (newWidth >= 0) {
            this.width = newWidth;
        } else {
            System.out.println("Width cannot be negative.");
            this.width = 0;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double newHeight) {
        if (newHeight >= 0) {
            this.height = newHeight;
        } else {
            System.out.println("Height cannot be negative.");
            this.height = 0;
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle: " + this.width * this.height);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of rectangle: " + 2 * (this.width + this.height));
    }
}
