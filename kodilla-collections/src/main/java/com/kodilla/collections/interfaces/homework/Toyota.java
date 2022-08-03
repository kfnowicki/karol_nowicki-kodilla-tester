package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{

    private int speed;

    public Toyota(){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 50;
    }

    @Override
    public void decreaseSpeed() {
       this.speed = this.speed - 10;
    }
}
