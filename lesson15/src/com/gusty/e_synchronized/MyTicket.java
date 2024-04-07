package com.gusty.e_synchronized;

public class MyTicket implements Runnable {

    //定義100張票
    int ticket = 100;

    //任意new一個對象
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (obj) {
                //線程不安全的程式
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "買了第" + ticket + "張票");
                    ticket--;
                }
            }
        }
    }
}
