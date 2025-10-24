package com.data.structures.learn.leetcode.binaysearch;

public class SqaureRootUsingBinarySearch {

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int start = 1;
        int end = x / 2;
        int response = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                start = mid + 1;
                response = mid;
            } else {
                end = mid - 1;
            }
        }
        return response;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }

}
