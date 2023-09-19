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
