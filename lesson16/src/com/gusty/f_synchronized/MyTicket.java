package com.gusty.f_synchronized;

public class MyTicket implements Runnable {

    //定義100張票
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // method01();
            method02();
        }
    }

//    public synchronized void method01(){
//        if (ticket > 0) {
//            System.out.println(Thread.currentThread().getName() + "買了第" + ticket + "張票");
//            ticket--;
//        }
//    }

    public void method02() {
        synchronized (this) {
            System.out.println(this + ".......");
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "買了第" + ticket + "張票");
                ticket--;
            }
        }
    }
}
