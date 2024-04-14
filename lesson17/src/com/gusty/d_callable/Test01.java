package com.gusty.d_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        //接收callable回傳的參數
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        //創建Thread對象-> Thread (Runnable runnable)
        Thread thread = new Thread(futureTask);
        thread.start();
        //調用get方法獲取call方法的返回值
        System.out.println(futureTask.get());
    }
}
