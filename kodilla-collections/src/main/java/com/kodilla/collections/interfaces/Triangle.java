package com.kodilla.collections.interfaces;

public class Triangle implements Shape{
    private double width;
    private double height;
    private double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return 1/2 * this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return this.width + this.height + this.hypotenuse;
    }
}
