package com.gusty.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        /**
         * 氣泡排排序
         */
        int arr[] = {23, 57, 2, 8, 99, 7};

        //外層循環代表比較了幾圈，n-1圈
        for (int i = 0; i < arr.length - 1; i++) {
            //內層循環代表比較的次數，每圈都少比較一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
