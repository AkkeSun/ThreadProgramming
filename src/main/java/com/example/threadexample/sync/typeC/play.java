package com.example.threadexample.sync.typeC;

public class play {

    public static void main(String[] args) {
        for(int i =0; i < 3; i++) {
            Thread t = new Thread(new RunnableTypeC());
            t.start();
        }
    }
}
