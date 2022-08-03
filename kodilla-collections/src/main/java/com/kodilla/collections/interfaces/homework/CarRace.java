package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {
        Mitsubishi mitsubishi = new Mitsubishi();
        doRace(mitsubishi);

        Toyota toyota = new Toyota();
        doRace(toyota);

        Ford ford = new Ford();
        doRace(ford);

    }

    private static void doRace(Car car){
        for (int i = 0; i < 3; i++){
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed() + " km/h");
    }
}
