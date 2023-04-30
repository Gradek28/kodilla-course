package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car{
    private boolean headlightsOn;
    private String carType;

    public Cabrio(boolean headlightsOn, String carType) {
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
