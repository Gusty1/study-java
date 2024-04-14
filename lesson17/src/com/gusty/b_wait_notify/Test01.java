package com.gusty.b_wait_notify;

public class Test01 {
    public static void main(String[] args) {
        Store store = new Store();

        Product product = new Product(store);
        Consumer consumer = new Consumer(store);

        new Thread(product).start();
        new Thread(product).start();
        new Thread(product).start();

        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
