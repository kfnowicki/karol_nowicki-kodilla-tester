package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{

    private int speed;
    private int acceleration;

    public Toyota(int acceleration){
        this.speed = 0;
        this.acceleration = acceleration;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + this.acceleration;
    }

    @Override
    public void decreaseSpeed() {
       this.speed = this.speed - 10;
    }
}
