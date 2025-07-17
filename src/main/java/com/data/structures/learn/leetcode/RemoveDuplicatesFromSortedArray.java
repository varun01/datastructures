package com.data.structures.learn.leetcode;

import com.data.structures.learn.linkedlist.util.ArrayUtil;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * <p>
 * int k = removeDuplicates(nums); // Calls your implementation
 * <p>
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        String s = "asdfasfa";
        char c = s.charAt(1);
        System.out.printf("Char:%s, Value: %s%n", (int) c, c);
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int swapIndex = 1;
        int temp = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[swapIndex] != nums[i]) {
                temp = nums[i];
                nums[i] = nums[swapIndex];
                nums[swapIndex] = temp;
                i++;
                swapIndex++;
            }
        }
        ArrayUtil.printArray(nums);
        return swapIndex;
    }

}
