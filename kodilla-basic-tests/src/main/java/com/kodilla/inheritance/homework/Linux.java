package com.kodilla.inheritance.homework;

public class Linux extends OperatingSysetem {
    public Linux(int year){
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Funny Penguin Dancing");
        System.out.println("Hello there, How are you?");
    }

    @Override
    public void turnOff(){
        System.out.println("Shutting down your PC");
        System.out.println("Funny Penguin Waving");
    }

    public void showKernelPanic(){
        System.out.println("Something went wrong, we need to restart your PC");
        System.out.println("Sad Penguin face");
        this.turnOn();
    }
}