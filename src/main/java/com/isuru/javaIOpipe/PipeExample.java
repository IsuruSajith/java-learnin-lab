package com.isuru.javaIOpipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);


        Thread producerThread = new Thread(() -> {
            try {
                pos.write("Hello, Pipe!".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
