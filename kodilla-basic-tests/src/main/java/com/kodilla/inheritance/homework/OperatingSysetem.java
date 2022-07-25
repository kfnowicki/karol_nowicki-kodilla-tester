package com.kodilla.inheritance.homework;

public class OperatingSysetem {
    private int year;

    public OperatingSysetem (int year){
        this.year = year;
    }

    public void turnOn(){
        System.out.println("Loading...");
        System.out.println("Welcome");
    }

    public void turnOff(){
        System.out.println("Shutting down, goodbye");
    }

    public int getYear() {
        return year;
    }
}
