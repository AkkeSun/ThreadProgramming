package com.example.threadexample.sync.typeA;
import com.example.threadexample.sync.typeA.core.NonSyncRunnableA;
import com.example.threadexample.sync.typeA.core.SyncRunnableA;

public class PlayA {

    public static void main(String[] args) {
        syncTest();
    }

    public static void syncTest() {
        SyncObjA obj = new SyncObjA(); // 동시자원
        for(int i =0; i <10; i++) {
            new Thread(new SyncRunnableA(obj)).start();
        }
    }

    public static void nonSyncTest() {
        SyncObjA obj = new SyncObjA(); // 동시자원
        for(int i =0; i <10; i++) {
            new Thread(new NonSyncRunnableA(obj)).start();
        }
    }
}
