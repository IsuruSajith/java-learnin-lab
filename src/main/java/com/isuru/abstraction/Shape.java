package com.isuru.abstraction;

public abstract class Shape {
    protected int x, y;
    public abstract double calculateArea();
    public void display() {
        System.out.println("Shape at (" + x + ", " + y + ")");
    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
class Circle extends Shape {

    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
