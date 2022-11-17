package com.example.threadexample.sync.typeB;

import com.example.threadexample.sync.typeB.nonSync.NonSyncObj;
import com.example.threadexample.sync.typeB.nonSync.NonSyncRunnable;
import com.example.threadexample.sync.typeB.sync.SyncObj;
import com.example.threadexample.sync.typeB.sync.SyncRunnable;

public class PlayB {

    public static void main(String[] args) {
       //  syncTest();
        nonSyncTest();
    }

    public static void syncTest() {
        SyncObj obj = new SyncObj();
        for(int i =0; i <10; i++) {
            new Thread(new SyncRunnable(obj)).start();
        }
    }

    public static void nonSyncTest() {
        NonSyncObj obj = new NonSyncObj();
        for(int i =0; i <10; i++) {
            new Thread(new NonSyncRunnable(obj)).start();
        }
    }
}
