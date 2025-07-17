package com.data.structures.learn.leetcode;

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[m+n];
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        for(; i< m; i++) {
            result[k++] = nums1[i];
        }
        for(; j<n ; j++) {
            result[k++] = nums2[j];
        }
        for(i = 0; i<k; i++) {
            nums1[i] = result[i];
        }
        return nums1;
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        nums1 = mergeSortedArray.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
