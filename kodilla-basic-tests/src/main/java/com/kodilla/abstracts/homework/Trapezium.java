package com.kodilla.abstracts.homework;

public class Trapezium extends Shape{

    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;
    private int height;

    public Trapezium(int sideA, int sideB, int sideC, int sideD, int height) {
        super("Trapezium");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC + this.sideD;
    }

    @Override
    public double calculateArea() {
        return ((this.sideA + this.sideB) * this.height)/2;
    }
}
