package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];
        for (int i = 0; i < cars.length; i++){
            cars[i] = drawCar();
            cars[i].increaseSpeed();
            CarUtils.describeCar(cars[i]);
        }
    }

    /* why I can't use the following?
    for (Car car : cars){
        drawCar();
    }
     */

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarModel = random.nextInt(3);
        int acceleration = getAcceleration(random);
        if (drawnCarModel == 0)
            return new Toyota(acceleration);
        else if (drawnCarModel == 1)
            return new Mitsubishi(acceleration);
        else {
            return new Ford(acceleration);
        }
    }

    private static int getAcceleration(Random random) {
        return random.nextInt( 200) + 1;
    }
}
