package com.example.threadexample.sync.typeB.sync;

public class SyncObj {
    public int num = 0;

    // synchronized method : 해당 Method는 하나의 Thread만 실행 가능하므로 5이상의 데이터가 출력되지 않는다.
    public synchronized void sum(){
        if(num < 5) {
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            num++;
        }
        System.out.println(num);
    }
}
