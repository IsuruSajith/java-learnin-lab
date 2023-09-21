package com.isuru.thread;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Incremented: " + count);
    }

    public int getCount() {
        return count;
    }
}
