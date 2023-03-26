package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        AlfaRomeo alfaRomeo = new AlfaRomeo(250, 50, 50);
        doRace(alfaRomeo);

        Maserati maserati = new Maserati(300, 30,50);
        doRace(maserati);

        Ferrari ferrari = new Ferrari(350 , 100, 30);
        doRace(ferrari);
    }

    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed());
    }

    }

