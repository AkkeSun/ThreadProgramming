package com.example.threadexample.basic.core;

import com.example.threadexample.basic.task.MyTask;

public class ThreadExample extends Thread{

    @Override
    public void run() {
        String threadName = getName();
        MyTask task = new MyTask(threadName);
        task.play();
    }

}
