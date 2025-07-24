package com.data.structures.learn.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * <p>
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * <p>
 * Explanation:
 * All elements are distinct.
 * <p>
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        int high = nums.length - 1;
        int low = 0;
        while(low < high) {
            boolean lowValid = integers.add(nums[low++]);
            boolean highValid = integers.add(nums[high--]);
            if(!(lowValid && highValid)) {
                return true;
            }
        }
        if(low == high) {
            return !integers.add(nums[low]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,11,2};
        System.out.println(containsDuplicate(nums));
    }
}
