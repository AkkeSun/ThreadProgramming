package com.example.threadexample.sync.typeC;

public class RunnableTypeC implements Runnable{

    int num1 = 0;
    int num2 = 0;
    static int num3 = 0;

    @Override
    public void run() {
        for(int i =0; i<10; i++) {
            num1 ++;
            num2 ++;
            num3 ++;
        }
        System.out.println(Thread.currentThread().getName() + " num1 : " + num1);
        System.out.println(Thread.currentThread().getName() + " num2 : " + num2);
        System.out.println(Thread.currentThread().getName() + " num3 : " + num3);
    }
}
