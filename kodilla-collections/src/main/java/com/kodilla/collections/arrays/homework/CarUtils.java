package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Maserati;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Car kind:" + getCarName(car));
        System.out.println("Car speed is:" + car.getSpeed());
        System.out.println("Car speed increase is:" + car.increaseSpeed());
        System.out.println("Car speed decrease is:" + car.decreaseSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof AlfaRomeo)
            return "AlfaRomeo";
        else if (car instanceof Maserati)
            return "Maserati";
        else if (car instanceof Ferrari)
            return "Ferrari";
        else
            return "Unknown car name";

    }
}
