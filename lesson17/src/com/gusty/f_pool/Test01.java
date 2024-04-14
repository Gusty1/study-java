package com.gusty.f_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(new MyString());
        Future<Integer> future2 = executorService.submit(new MySum());
        System.out.println(future1.get());
        System.out.println(future2.get());
    }
}
