package com.kodilla.inheritance.homework;

public class HomeworkApplication {

    public static void main(String[] args){
        OperatingSysetem randomSystem = new OperatingSysetem(1990);
        randomSystem.turnOn();
        System.out.println("This system was created in " + randomSystem.getYear());
        randomSystem.turnOff();

        System.out.println();

        Windows windows = new Windows(2015);
        windows.turnOn();
        windows.showBlueScreen();
        System.out.println("This system was created in " + windows.getYear());
        windows.turnOff();

        System.out.println();

        Linux linux = new Linux(2020);
        linux.turnOn();
        linux.showKernelPanic();
        System.out.println("This system was created in " + linux.getYear());
        linux.turnOff();
    }
}
