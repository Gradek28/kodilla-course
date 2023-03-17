package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double height;
    private double width;
    private double radius;

    public void setValues(double height, double width, double radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public double getHeight() {
        return height;

    }
    public double getWidth() {
        return width;
    }
    public double getRadius(){
        return radius;
    }
}
