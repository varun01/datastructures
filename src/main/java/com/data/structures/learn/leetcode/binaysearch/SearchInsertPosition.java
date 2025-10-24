package com.data.structures.learn.leetcode.binaysearch;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int result = searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
