package com.data.structures.learn.leetcode.binaysearch;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int left = 0;
        int right = m - 1;

        while (left <= right) {
            int smallMid = (left + right) / 2;
            int bigMid = (m + n) / 2 - smallMid;

            int nums1Left = smallMid == 0 ? Integer.MIN_VALUE : nums1[smallMid];
            int nums1Right = smallMid == m ? Integer.MAX_VALUE : nums1[smallMid + 1];
            int nums2Left = bigMid == 0 ? Integer.MIN_VALUE : nums2[bigMid];
            int nums2Right = bigMid == n ? Integer.MAX_VALUE : nums2[bigMid + 1];

            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
                } else {
                    return Math.max(nums1Left, nums2Left);
                }
            } else if (nums1Left > nums2Right) {
                right = smallMid - 1;
            } else {
                left = smallMid + 1;
            }
        }
        return 0;
    }

}
