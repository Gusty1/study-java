package com.gusty.var;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 可變參數，練習2
         */
        conact("-", "BILL", "IAN", "ERIC");
    }

    public static void conact(String regex, String... arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + regex;
            }
        }
        System.out.println(str);
    }
}
