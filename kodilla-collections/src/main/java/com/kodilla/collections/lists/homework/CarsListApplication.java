package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Toyota corolla = new Toyota(100);
        cars.add(corolla);
        cars.add(new Mitsubishi(150));
        cars.add(new Ford(80));

        for (Car car : cars)
            car.increaseSpeed();

        displayList(cars);

        cars.remove(2);
        cars.remove(corolla);

        Ford mustangMachE = new Ford(120);
        cars.remove(mustangMachE);

        System.out.println("+++++++++++++++++++++++++");
        System.out.println("List size: " + cars.size());
        displayList(cars);

    }

    private static void displayList(List<Car> cars) {
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

