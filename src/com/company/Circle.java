package com.company;

public class Circle {
    static final double PI = 3.14159265359;
    static double radius;

    public static void area(){
        System.out.println("Area of radius: " + PI * (radius * radius));
    }

    public static void circumference(){
        System.out.println("Circumference of radius: " + PI * 2 * radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
