package isuru.interfaces.impl;

import isuru.interfaces.Motion;

public class Car implements Motion {

    @Override
    public void drive() {
        System.out.println("hello im Drive a car");
    }
}
