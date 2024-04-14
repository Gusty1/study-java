package com.gusty.a_thread;

import com.gusty.b_threadmethod.MyThread;

public class Test01 {
    public static void main(String[] args) {
        //創建線程對象
        MyThread t1 = new MyThread();

        //調用start方法，開啟線程，jvm自動調用run方法
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主線程...執行了" + i);
        }
    }
}
