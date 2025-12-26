package com.data.structures.learn.leetcode;

import com.data.structures.learn.leetcode.linkedlist.util.ArrayUtil;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * <p>
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {1,0, 1, 0, 3, 12, 0 , 0 , 0, 1};
        ArrayUtil.printArray(nums);
        moveZeros(nums);
        ArrayUtil.printArray(nums);
    }

    private static void moveZeros(int[] nums) {
        int i = 0;
        for(int num:nums) {
            if(num!=0) {
                nums[i] = num;
                i++;
            }
        }
        while( i < nums.length) {
            nums[i] =0;
            i++;
        }
    }
}
