package com.gusty.e_pool;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"...執行了");
    }
}
