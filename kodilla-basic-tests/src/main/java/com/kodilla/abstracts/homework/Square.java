package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int side;

    public Square(int side){
        super("Square");
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return this.side * 4;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}
