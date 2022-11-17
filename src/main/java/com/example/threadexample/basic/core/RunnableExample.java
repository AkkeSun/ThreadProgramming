package com.example.threadexample.basic.core;

import com.example.threadexample.basic.task.MyTask;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        MyTask task = new MyTask(threadName);
        task.play();
    }
}
