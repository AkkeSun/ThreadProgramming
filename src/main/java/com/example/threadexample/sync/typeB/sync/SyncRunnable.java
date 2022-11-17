package com.example.threadexample.sync.typeB.sync;

public class SyncRunnable implements Runnable {

    private SyncObj obj;
    public SyncRunnable(SyncObj obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.sum();
    }
}
