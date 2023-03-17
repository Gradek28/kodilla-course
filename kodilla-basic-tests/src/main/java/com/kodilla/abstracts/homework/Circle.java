package com.kodilla.abstracts.homework;

import static java.lang.Math.PI;

public class Circle extends Shape{

    public double getArea(){
        return PI*(getRadius() * getRadius());
    }
    public double getPerimeter(){
        return 2 * PI * getRadius();
    }
}
