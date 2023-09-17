package com.isuru.interfaces;

public interface MyInterface {
    void myMethod();

    default void myDefaultMethod() {
        System.out.println("default method in java");
    }
}
