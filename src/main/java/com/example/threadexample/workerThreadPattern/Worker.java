package com.example.threadexample.workerThreadPattern;

/**
 * 일을 하는 객채
 */
public class Worker extends Thread{
    private final Channel channel;

    public Worker(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    public void run() {
        while(true) {
            Request request = channel.takeRequest();
            request.execute();
        }
    }
}
