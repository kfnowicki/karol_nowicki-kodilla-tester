package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 40;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 20;
    }
}
