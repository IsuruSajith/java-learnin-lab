package com.isuru.desing_patterns;

import java.util.Random;

public class Singleton {
    private static Singleton instance;
    private int random;

    Singleton() {
        Random random = new Random();
      this.random=random.nextInt();

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getRandom() {
        return random;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        Singleton instance4 = Singleton.getInstance();
        System.out.println(instance.getRandom());
        System.out.println(instance2.getRandom());
        System.out.println(instance3.getRandom());
        System.out.println(instance4.getRandom());

    }
}

