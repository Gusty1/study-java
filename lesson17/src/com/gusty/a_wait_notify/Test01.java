package com.gusty.a_wait_notify;

public class Test01 {
    public static void main(String[] args) {
        Store store = new Store();

        Product product = new Product(store);
        Consumer consumer = new Consumer(store);

        Thread t1 = new Thread(product);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
