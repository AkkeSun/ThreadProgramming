package com.example.threadexample.threadPool.core;

import com.example.threadexample.threadPool.MyCallable;
import com.example.threadexample.threadPool.MyRunnable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Fixecd Thread
 * 고정된 Worker Thread를 사용하며, 모든 Thread를 사용 중 이라면 Queue에 쌓여 대기.
 * 실패 시, 새로운 Thread를 생성하여 대체.
 */
public class FixedThreadPoolExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int threadCnt = 10;
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(threadCnt);
        for (int i=0; i<30; i++) {

            // 실행 1 : execute
            // 파라미터로 runnable 입력 (void 형태)
            // 오류 발생시 Thread 제거
            fixedThreadPool.execute(new MyRunnable());

            // 실행 2 : submit
            // 파라미터로 Runnable 또는 Callable 입력
            // Callable 입력시 Future 리턴
            // 예외 발생시 Thread 제거되지 않고 재사용
            Future<String> result = fixedThreadPool.submit(new MyCallable());
            String str = result.get();
            System.out.println(str);
        }

        fixedThreadPool.shutdown();
    }
}
