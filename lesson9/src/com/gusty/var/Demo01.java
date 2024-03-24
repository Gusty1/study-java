package com.gusty.var;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 可變參數，練習1
         */
        sum(1,2,3,4,5);
    }

    public static void sum(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
