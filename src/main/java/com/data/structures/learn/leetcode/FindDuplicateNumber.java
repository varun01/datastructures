package com.data.structures.learn.leetcode;

/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and using only constant extra space.
 * */
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {3,1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            count[nums[i] - 1]++;
            if(count[nums[i] - 1] > 1) {
                return nums[i];
            }
            count[nums[j] - 1]++;
            if(count[nums[j] - 1] > 1) {
                return nums[j];
            }
            i++;
            j--;
        }
        return 0;
    }

}
