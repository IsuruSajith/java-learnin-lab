package com.isuru.java_random_revision.interfaces.impl;

import com.isuru.java_random_revision.interfaces.Motion;

public class Car implements Motion {

    @Override
    public void drive() {
        System.out.println("hello im Drive a car");
    }
}
