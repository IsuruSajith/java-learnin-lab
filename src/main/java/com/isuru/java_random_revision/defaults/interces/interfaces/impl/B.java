package com.isuru.java_random_revision.defaults.interces.interfaces.impl;

import com.isuru.java_random_revision.defaults.interces.interfaces.DefaultInter;

public interface B extends DefaultInter {
    default void myMethod() {
        System.out.println("interface B");
    }
}
