package isuru.defaults.interces.interfaces.impl;

import isuru.defaults.interces.interfaces.DefaultInter;

public interface B extends DefaultInter {
    default void myMethod() {
        System.out.println("interface B");
    }
}
