package com.example.threadexample.sync.typeB.nonSync;

public class NonSyncRunnable implements Runnable {

    private NonSyncObj obj;
    public NonSyncRunnable(NonSyncObj obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.sum();
    }
}
