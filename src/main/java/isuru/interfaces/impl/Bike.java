package isuru.interfaces.impl;

import isuru.interfaces.Motion;

public class Bike implements Motion {
    @Override
    public void drive() {
        System.out.println("hello im drive a bike");
    }
}
