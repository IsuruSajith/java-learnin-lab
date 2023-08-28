package com.isuru.java_random_revision.singleton.test;

public class Singleton1 {
    {
        System.out.println("instance method");
    }
    static {
        System.out.println("static method");
    }
    private static Singleton1 singleton1;
    private String name;

    private Singleton1() {
        this.name = "com/isuru";
        System.out.println("constructor");
    }

    public static Singleton1 getInstance() {
        return (singleton1 == null) ? singleton1 = new Singleton1() : singleton1;
    }

    public void printThis() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }
}
