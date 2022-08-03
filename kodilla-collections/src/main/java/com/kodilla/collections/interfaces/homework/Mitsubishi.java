package com.kodilla.collections.interfaces.homework;

public class Mitsubishi implements Car {
    private int speed;

    public Mitsubishi(){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 60;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 15;
    }
}
