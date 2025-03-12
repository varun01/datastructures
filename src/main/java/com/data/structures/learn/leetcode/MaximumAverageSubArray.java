package com.data.structures.learn.leetcode;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 * <p>
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * <p>
 * Example 2:
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */
public class MaximumAverageSubArray {

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums, 4));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int start = 0;
        int max = sum;
        while ((start + k) < nums.length) {
            sum -= nums[start];
            sum += nums[start + k];
            start++;
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }

}
