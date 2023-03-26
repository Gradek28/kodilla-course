package com.kodilla.collections.interfaces.homework;

public class Maserati implements Car{
    private int speed;
    private int decrease;
    private int increase;


    public Maserati(int speed, int decrease, int increase) {
        this.speed = speed;
        this.decrease = decrease;
        this.increase = increase;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed + increase;
    }



    @Override
    public int decreaseSpeed() {
        return speed - decrease;
    }

    }

