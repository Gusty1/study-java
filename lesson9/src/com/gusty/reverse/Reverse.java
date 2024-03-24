package com.gusty.reverse;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        /**
         * 陣列反轉，練習
         */
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
