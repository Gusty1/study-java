package com.gusty.e_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
    public static void main(String[] args) {
        //創建線程池對象
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());

        //關閉線程池對象
        executorService.shutdown();

    }
}
