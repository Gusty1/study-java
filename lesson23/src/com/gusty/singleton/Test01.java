package com.gusty.singleton;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //System.out.println(Singleton.getSingleton());
            System.out.println(Singleton1.getSingleton1());
        }
    }
}
