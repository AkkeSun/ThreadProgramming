package com.example.threadexample.basic.task;

public class MyTask {

    private String threadName;

    public MyTask(String threadName){
        this.threadName = threadName;
    }

    public void play() {
        for(int i = 1; i<= 100; i++) {
            System.out.println("Hello " + this.threadName + " : " + i);
        }
    }
}
