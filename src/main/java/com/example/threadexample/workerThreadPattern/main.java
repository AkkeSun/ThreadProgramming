package com.example.threadexample.workerThreadPattern;

public class main {

    public static void main(String[] args) {
        Channel channel = new Channel(10);
        WorkerPool workers = new WorkerPool(5, channel);
        workers.start();

        new Client("ClientA", channel).start();
        new Client("ClientB", channel).start();
        new Client("ClientC", channel).start();
    }
}
