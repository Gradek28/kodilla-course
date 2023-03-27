package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Maserati;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        AlfaRomeo alfaRomeo = new AlfaRomeo(300);
        cars.add(alfaRomeo);
        cars.add(new Maserati(250));
        cars.add(new Ferrari(200));

        cars.remove(1);
        cars.remove(alfaRomeo);

        System.out.println(cars.size());

        for (Car ferrari : cars ) {
            if (ferrari.getSpeed() > 100)
                CarUtils.describeCar(ferrari);

        }
        for (Car maserati : cars) {
            if (maserati.getSpeed() > 100)
                CarUtils.describeCar(maserati);
        }



    }
}
