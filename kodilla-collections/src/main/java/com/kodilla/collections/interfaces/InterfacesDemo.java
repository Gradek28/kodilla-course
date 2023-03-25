package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        showSquareDetails(square);

        Circle circle = new Circle(7.0);
        showCircleDetails(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showTriangleDetails(triangle);
    }

    private static void showSquareDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }

    private static void showCircleDetails(Circle circle) {
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }

    private static void showTriangleDetails(Triangle triangle) {
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
    }

