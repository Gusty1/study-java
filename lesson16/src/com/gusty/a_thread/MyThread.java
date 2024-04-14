package com.gusty.a_thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("線程...執行了" + i);
        }
    }
}
