package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    private final double PI = 3.14159265359;
    private double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * PI * this.radius;
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = PI * this.radius * this.radius;
        return area;
    }
}
