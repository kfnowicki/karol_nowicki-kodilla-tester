package com.kodilla.abstracts;

public class AnimalProcessor {

    public void process(Animal animal) {
        System.out.println("This animal has " + animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }
}
