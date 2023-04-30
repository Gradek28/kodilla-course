package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    private boolean headlightsOn;
    private String carType;

    public Sedan(boolean headlightsOn, String carType) {
        this.headlightsOn = headlightsOn;
        this.carType = carType;
    }

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime dayTime) {
        return headlightsOn;
    }

    @Override
    public String getCarType() {
        return carType;
    }
}
