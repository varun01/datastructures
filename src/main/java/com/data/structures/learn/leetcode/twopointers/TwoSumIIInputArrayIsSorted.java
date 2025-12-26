package com.data.structures.learn.leetcode.twopointers;

import java.util.HashMap;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * <p>
 * Your solution must use only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * Example 2:
 * <p>
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefor, index1 = 1, index2 = 3. We return [1, 3].
 */
public class TwoSumIIInputArrayIsSorted {

    public static void main(String[] args) {
        int[] nums = {2,5,7,11,15};
        for (int i : twoSum(nums, 9)){
            System.out.print(i + "\t");
        }

    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])) {
                return new int[] {map.get(target - numbers[i]), i + 1};
            }
            map.put(numbers[i], i + 1);
        }
        return new int[2];
    }

}
