package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-------------------------");
        System.out.println("Car model: " + getCarModel(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarModel(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Mitsubishi)
            return "Mitsubishi";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car model";
    }
}
