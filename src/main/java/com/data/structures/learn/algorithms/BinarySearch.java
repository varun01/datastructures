package com.data.structures.learn.algorithms;

import com.data.structures.learn.leetcode.linkedlist.util.ArrayUtil;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 9, 10, 11, 14, 16, 18, 20, 21, 24, 26, 29, 30, 31, 33, 39, 40, 45, 48, 51};
        ArrayUtil.printArrayWithIndex(arr);
        System.out.println(binarySearch(arr, 31));
    }

    private static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(target == array[mid]) {
                return mid;
            }
            if(target < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
