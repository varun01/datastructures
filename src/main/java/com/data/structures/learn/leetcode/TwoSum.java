package com.data.structures.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            valueIndexMap.put(nums[i], i);
        }
        int[] indexResult = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if(valueIndexMap.containsKey(result) && (i != valueIndexMap.get(result))) {
                indexResult[0] = i;
                indexResult[1] = valueIndexMap.get(result);
                return indexResult;
            }
        }
        return indexResult;
    }
}
