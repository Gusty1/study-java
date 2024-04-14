package com.gusty.a_wait_notify;

public class Product implements Runnable {
    private Store store;

    public Product(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.setCount();
        }
    }
}
