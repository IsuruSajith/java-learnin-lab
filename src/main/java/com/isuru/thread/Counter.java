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

class IncrementTask implements Runnable {
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted.");
            }
        }
    }
}
class ThreadExample {
    public static void main(String[] args) {
        Counter counter = new Counter();


        Thread thread1 = new Thread(new IncrementTask(counter));
        Thread thread2 = new Thread(new IncrementTask(counter));

        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}

