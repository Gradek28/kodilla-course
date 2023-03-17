package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public double getArea() {
        return getHeight() * getWidth();
    }
    public double getPerimeter(){
        return (getHeight() + getHeight())*2;
    }
}