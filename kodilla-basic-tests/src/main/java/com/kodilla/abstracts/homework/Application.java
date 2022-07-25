package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        ShapeName shapeName = new ShapeName();
        Circle circle = new Circle(4);
        shapeName.displayName(circle);
        System.out.println("Perimeter: " + circle.calculatePerimeter() + " Area: " + circle.calculateArea());

        System.out.println();
        Square square = new Square(5);
        shapeName.displayName(square);
        System.out.println("Perimeter: " + square.calculatePerimeter() + " Area: " + square.calculateArea());

        System.out.println();
        Trapezium trapezium = new Trapezium(8, 6, 4, 6,4);
        shapeName.displayName(trapezium);
        System.out.println("Perimeter: " + trapezium.calculatePerimeter() + " Area: " + trapezium.calculateArea());

    }
}
