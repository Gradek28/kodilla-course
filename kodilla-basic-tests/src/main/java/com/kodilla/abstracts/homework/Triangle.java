package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public double getArea() {
        return (getHeight() * getWidth()) / 2;
    }
    public double getPerimeter(){
        return getWidth() + getWidth() + getWidth();
    }
}