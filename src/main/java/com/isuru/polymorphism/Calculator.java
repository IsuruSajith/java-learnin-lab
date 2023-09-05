package com.isuru.polymorphism;

public class Calculator {

    public int add(int a, int b) {
        System.out.println("int a , int b");
        return a + b;
    }
    public int add(int a, int b, int c) {
        System.out.println("int a , int b, int c");
        return a + b + c;
    }
    public double add(double a, double b) {
        System.out.println("double a , double b");
        return a + b;
    }
    public String add(String a, String b) {
        System.out.println("string a, string b");
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of two integers: " + calculator.add(5, 7));
        System.out.println("Sum of three integers: " + calculator.add(2, 3, 4));
        System.out.println("Sum of two doubles: " + calculator.add(3.5, 2.1));
        System.out.println("Concatenation of two strings: " + calculator.add("Hello, ", "World!"));
    }
}
