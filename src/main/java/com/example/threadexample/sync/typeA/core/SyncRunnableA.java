package com.example.threadexample.sync.typeA.core;

import com.example.threadexample.sync.typeA.SyncObjA;

public class SyncRunnableA implements Runnable {

    private SyncObjA obj;
    public SyncRunnableA(SyncObjA obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) { // 해당 부분은 하나의 Thread 만 실행 가능
            if(obj.num < 5) {
                try {
                    Thread.sleep(500);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                obj.num++;
            }
            System.out.println(obj.num);
        }
    }
}
