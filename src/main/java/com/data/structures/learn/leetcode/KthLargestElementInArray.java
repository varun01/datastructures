package com.data.structures.learn.leetcode;

import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Can you solve it without sorting?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * Example 2:
 * <p>
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 */
public class KthLargestElementInArray {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            maxHeap.offer(num);
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = maxHeap.poll();
        }
        return result;
    }
}
