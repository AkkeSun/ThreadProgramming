package com.example.threadexample.sync.typeA.core;

import com.example.threadexample.sync.typeA.SyncObjA;

public class NonSyncRunnableA implements Runnable {

    private SyncObjA obj;
    public NonSyncRunnableA(SyncObjA obj) {
        this.obj = obj;
    }

    @Override
    public void run() { // 동시성 이슈로 인해 5 이상의 데이터가 출력된다.
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
