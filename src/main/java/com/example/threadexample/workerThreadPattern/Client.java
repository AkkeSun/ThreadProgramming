package com.example.threadexample.workerThreadPattern;

import java.util.Random;

/**
 * 업무를 요청하는 Thread
 */
public class Client extends Thread{
    private final Channel channel;
    private static final Random random = new Random();
    public Client(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }
    public void run() {
        try {
            for (int i = 0; true; i++) {
                Request request = new Request(getName(), i);
                channel.putRequest(request);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
        }
    }
}
