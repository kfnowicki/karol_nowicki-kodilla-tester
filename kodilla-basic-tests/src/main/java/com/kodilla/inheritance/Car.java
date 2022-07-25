package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }

    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }

    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

}
