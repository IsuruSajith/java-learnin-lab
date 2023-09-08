package com.isuru.runnable;

public class RunnableTest implements Runnable {
    @Override
    public void run() {
        // This is where you put the code for the task to be executed
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        // Create an instance of the class that implements Runnable
        RunnableTest myRunnable = new RunnableTest();

        // Create a new thread and pass the Runnable instance to it
        Thread thread = new Thread(myRunnable);

        // Start the thread, which will execute the run() method
        myRunnable.run();
        thread.start();
    }

}
