package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{
    private boolean headlightsOn;
    private String carType;

    public SUV(boolean headlightsOn, String carType) {
        this.headlightsOn = headlightsOn;
        this.carType = carType;
    }

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime nightTime) {
        return headlightsOn;
    }

    @Override
    public String getCarType() {
        return carType;
    }
}
