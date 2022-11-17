package com.example.threadexample.threadPool.core;

import com.example.threadexample.threadPool.MyCallable;
import com.example.threadexample.threadPool.MyRunnable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * cached Thread
 * 필요에 따라서 새로운 Thread를 생성하며, 이전에 생성된 Thread가 존재하면 재사용.
 * 기본적으로 60초 정도 Thread가 유지.
 * 비동기 작업에 사용하는데 합리적.
 */
public class CachedThreadPoolExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i=0; i<30; i++) {

            // 실행 1 : execute
            // 파라미터로 runnable 입력 (void 형태)
            // 오류 발생시 Thread 제거
            cachedThreadPool.execute(new MyRunnable());

            // 실행 2 : submit
            // 파라미터로 Runnable 또는 Callable 입력
            // Callable 입력시 Future 리턴
            // 예외 발생시 Thread 제거되지 않고 재사용
            Future<String> result = cachedThreadPool.submit(new MyCallable());
            String str = result.get();
            System.out.println(str);
        }
    }
}
