package com.data.structures.learn.leetcode;

public class MinimumCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums2.length; i++) {
            int start = 0;
            int end = nums1.length - 1;
            int target = nums2[i];

            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums1[mid] == target) {
                    return target;
                } else if (target < nums1[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2};
        int result = getCommon(nums1, nums2);
        if (result != -1) {
            System.out.println("The minimum common value is: " + result);
        } else {
            System.out.println("No common value found.");
        }
    }
}
