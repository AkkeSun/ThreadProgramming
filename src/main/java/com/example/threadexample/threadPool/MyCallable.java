package com.example.threadexample.threadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() {
        System.out.println("hello " + Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }
}
