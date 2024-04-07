package com.gusty.c_runnable;

public class Test02 {
    public static void main(String[] args) {
        /*
        匿名內部類創建多線程
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "...執行了" + i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "...執行了" + i);
                }
            }
        }).start();
    }
}
