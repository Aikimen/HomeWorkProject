package oop.geometry;

public class Circle {

    private double radius;
    private double pi = 3.1415;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}
