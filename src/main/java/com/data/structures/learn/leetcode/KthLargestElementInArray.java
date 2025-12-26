package com.data.structures.learn.leetcode;

import java.math.BigInteger;
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
        String[] nums = {"62","52054932","7685161227","404637","64990","63017","36841","69332","37956878","4918","95191088"};
        BigInteger f = new BigInteger("");
        System.out.println(findKthLargest(nums, 4));
    }

    private static String findKthLargest(String[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (String num : nums) {
            minHeap.offer(Long.valueOf(num));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return String.valueOf(minHeap.peek()).split("\\.")[0];
    }
}
