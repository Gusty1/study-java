package com.gusty.d_ticket;

public class MyTicket implements Runnable {

    //定義100張票
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "買了第" + ticket + "張票");
                ticket--;
            }
        }
    }
}
