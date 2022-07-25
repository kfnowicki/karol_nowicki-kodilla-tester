package com.kodilla.inheritance;

public class Application {
    public static void main (String[] args){
        Car car = new Car(4,4);
        car.turnOnLights();
        car.openDoors();

        System.out.println();

        Convertible convertible = new Convertible(4,3);
        convertible.turnOnLights();
        convertible.openDoors();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
