package com.kodilla.abstracts.homework;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

}
