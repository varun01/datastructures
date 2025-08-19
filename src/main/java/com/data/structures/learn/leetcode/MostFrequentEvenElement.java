package com.data.structures.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return the most frequent even element.
 * <p>
 * If there is a tie, return the smallest one. If there is no such element, return -1.
 */
public class MostFrequentEvenElement {

    public static void main(String[] args) {
        int[] nums = {8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290};
        System.out.println(mostFrequentEven(nums));
    }

    private static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        int frequency = 0;
        int count;
        for(int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for(int key : map.keySet()) {
            count = map.get(key);
            if(count > frequency || (count == frequency && key < result)) {
                frequency = count;
                result = key;
            }
        }

        return result;
    }

}
