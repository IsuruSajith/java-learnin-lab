package com.isuru.volatile_keyword;

class SharedResource {
    // Using volatile to ensure visibility across threads
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public boolean isFlag() {
        return flag;
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Thread 1
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedResource.setFlagTrue();
            System.out.println("Flag set to true by Thread 1");
        }).start();

        // Thread 2
        new Thread(() -> {
            while (!sharedResource.isFlag()) {
                // Busy-waiting until flag becomes true
            }
            System.out.println("Flag is true, Thread 2 exiting");
        }).start();
    }
}
