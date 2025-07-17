package com.data.structures.learn.leetcode;

import java.util.ArrayList;

/**
 * You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
 * <p>
 * The length of the subarray is k, and
 * All the elements of the subarray are distinct.
 * Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
 * <p>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,5,4,2,9,9,9], k = 3
 * Output: 15
 * Explanation: The subarrays of nums with length 3 are:
 * - [1,5,4] which meets the requirements and has a sum of 10.
 * - [5,4,2] which meets the requirements and has a sum of 11.
 * - [4,2,9] which meets the requirements and has a sum of 15.
 * - [2,9,9] which does not meet the requirements because the element 9 is repeated.
 * - [9,9,9] which does not meet the requirements because the element 9 is repeated.
 * We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
 * Example 2:
 * <p>
 * Input: nums = [4,4,4], k = 3
 * Output: 0
 * Explanation: The subarrays of nums with length 3 are:
 * - [4,4,4] which does not meet the requirements because the element 4 is repeated.
 * We return 0 because no subarrays meet the conditions.
 */
public class MaximumSumOfDistinctSubArrayElements {

    public static void main(String[] args) {
        int[] nums = {9, 9, 9, 1, 2, 3};
        System.out.println(maximumSubarraySum(nums, 3));
    }

    private static long maximumSubarraySum(int[] nums, int k) {
        long result = 0;
        long sum = 0;
        var list = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            result = Math.max(sum, result);
            if (list.contains(Integer.valueOf(nums[i]))) {
                sum -= nums[i];
                result = 0;
            }
            list.add(nums[i]);
        }
        int start = 0;
        int end = k;
        long iterationSum;
        while (end < nums.length) {
            sum = sum - nums[start];
            list.remove(Integer.valueOf(nums[start]));
            sum = sum + nums[end];
            iterationSum = sum;
            if (list.contains(Integer.valueOf(nums[end]))) {
                iterationSum = 0;
            }
            result = Math.max(iterationSum, result);
            list.add(nums[end]);
            start++;
            end++;
        }

        return result;
    }

}
