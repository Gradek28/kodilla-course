package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setValues(1,1, 0);
        System.out.println("Area of rectangle: " + rect.getArea());
        System.out.println("Perimeter of rectangle: " + rect.getPerimeter());

        Triangle tri = new Triangle();
        tri.setValues(1,2,0);
        System.out.println("Area of triangle: " + tri.getArea());
        System.out.println("Perimeter of triangle: " + tri.getPerimeter());

        Circle cir = new Circle();
        cir.setValues(0,0,5);
        System.out.println("Area of circle: " + cir.getArea());
        System.out.println("Perimeter of circle: " + cir.getPerimeter());

    }
}
