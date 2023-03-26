package com.kodilla.collections.interfaces.homework;

public class AlfaRomeo implements Car{

    private int speed;
    private int decrease;
    private int increase;


    public AlfaRomeo(int speed, int decrease, int increase) {
        this.speed = speed;
        this.decrease = decrease;
        this.increase = increase;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    public int increaseSpeed() {
        return speed + increase;
    }

    @Override
    public int decreaseSpeed() {
        return speed - decrease;
    }
}


