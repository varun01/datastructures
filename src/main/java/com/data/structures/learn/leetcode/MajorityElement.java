package com.data.structures.learn.leetcode;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int element : nums) {
            if (count == 0) {
                candidate = element;
            }
            if(element == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

}

