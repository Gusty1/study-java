package com.gusty.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        /**
         * 費波那契數列 練習
         */
        System.out.println(fibonacci_test(12));
    }

    public static int fibonacci_test(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci_test(n - 1) + fibonacci_test(n - 2);
        }
    }
}
