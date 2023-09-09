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
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Main! Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

