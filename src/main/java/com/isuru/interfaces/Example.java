package com.isuru.interfaces;

public class Example implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("override method in interface");
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.myMethod();
        example.myDefaultMethod();
    }
}
