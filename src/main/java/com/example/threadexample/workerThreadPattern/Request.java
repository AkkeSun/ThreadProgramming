package com.example.threadexample.workerThreadPattern;

import java.util.Random;

/**
 * 일의 리퀘스트를 나타내는 클래스
 */
public class Request {

    private final String name;	// 의뢰자
    private final int number;	// 리퀘스트 번호
    private static final Random random = new Random();
    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    public void execute() {
        System.out.println(Thread.currentThread().getName() + " executes " + this);
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
        }
    }
    public String toString() {
        return "[ Request from " + name + " No." + number + " ]";
    }
}
