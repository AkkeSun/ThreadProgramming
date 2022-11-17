package com.example.threadexample.threadPool;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("hello " + Thread.currentThread().getName());
    }
}
