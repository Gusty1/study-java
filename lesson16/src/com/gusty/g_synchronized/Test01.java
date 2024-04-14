package com.gusty.g_synchronized;

public class Test01 {
    public static void main(String[] args) {
        /*
        線程安全問題，同步代碼塊
        */
        MyTicket myTicket = new MyTicket();

        Thread t1 = new Thread(myTicket, "鳴人");
        Thread t2 = new Thread(myTicket, "佐助");
        Thread t3 = new Thread(myTicket, "小櫻");

        t1.start();
        t2.start();
        t3.start();
    }
}
