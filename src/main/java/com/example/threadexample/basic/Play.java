package com.example.threadexample.basic;

import com.example.threadexample.basic.core.RunnableExample;
import com.example.threadexample.basic.core.ThreadExample;

public class Play {

    public static void main(String[] args) {
        threadTest();
        runnableTest();
    }

    public static void threadTest() {
        Thread t1 = new ThreadExample();
        Thread t2 = new ThreadExample();
        t1.setName("TH_1");
        t2.setName("TH_2");
        t1.start();
        t2.start();
    }

    public static void runnableTest() {
        Thread t1 = new Thread(new RunnableExample(), "RN_1");
        Thread t2 = new Thread(new RunnableExample(), "RN_2");
        t1.start();
        t2.start();
    }
}
