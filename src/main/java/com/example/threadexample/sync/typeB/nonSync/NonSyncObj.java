package com.example.threadexample.sync.typeB.nonSync;

public class NonSyncObj {
    int num = 0;

    public void sum(){ // 동시성 이슈로 5이상의 데이터가 출력된다
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
