package com.isuru.runnable;

public class MyRunnable implements Runnable{
    @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from MyRunnable! Count: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
class Main {
    MyRunnable myRunnable = new MyRunnable();


}

