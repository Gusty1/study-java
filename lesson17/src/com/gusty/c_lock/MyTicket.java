package com.gusty.c_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTicket implements Runnable {

    //定義100張票
    int ticket = 100;

    //創建lock對象
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
                //獲取鎖
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "買了第" + ticket + "張票");
                    ticket--;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //釋放鎖
                lock.unlock();
            }
        }
    }
}
