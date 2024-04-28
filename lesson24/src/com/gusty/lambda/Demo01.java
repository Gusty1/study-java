package com.gusty.lambda;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我執行了");
            }
        }).start();

        System.out.println("===========================");

        new Thread(() -> {
            System.out.println("我執行了");
        }).start();

        System.out.println("===========================");

        new Thread(() -> System.out.println("我執行了")).start();
    }
}
