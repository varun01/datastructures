package com.data.structures.learn.leetcode.binaysearch;

public class SearchInRotateSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]) {
                left = mid+1;
            } else if (nums[mid] < nums[right]){
                right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }
}
