package com.kodilla.inheritance.homework;

public class Windows extends OperatingSysetem{

    public Windows(int year){
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Loading bar");
        System.out.println("Hello");
    }

    @Override
    public void turnOff(){
        System.out.println("Time to say goodbye");
    }

    public void showBlueScreen(){
        System.out.println("Your PC ran into a problem, restarting now");
        this.turnOn();
    }
}
