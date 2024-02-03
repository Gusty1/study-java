package com.gusty.sort;

public class BinarySort {
    /**
     * 二分查找法
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int index= binary(arr,6);
        System.out.println(index);
    }

    public static int binary(int[] arr, int data) {
        //定義3個變數，最大索引、最小索引、中間索引
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        //查找
        while (min <= max) {
            mid = (min + max) / 2;
            if (data > arr[mid]) {
                min = mid + 1;
            } else if (data < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }

        //找不到的話返回-1
        return -1;
    }
}
