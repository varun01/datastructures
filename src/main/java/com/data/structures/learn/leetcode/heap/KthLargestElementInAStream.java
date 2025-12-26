package com.data.structures.learn.leetcode.heap;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * You are part of a university admissions office and need to keep track of the kth highest test score from applicants in real-time. This helps to determine cut-off marks for interviews and admissions dynamically as new applicants submit their scores.
 * <p>
 * You are tasked to implement a class which, for a given integer k, maintains a stream of test scores and continuously returns the kth highest test score after a new score has been submitted. More specifically, we are looking for the kth highest score in the sorted list of all scores.
 * <p>
 * Implement the KthLargest class:
 * <p>
 * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of test scores nums.
 * int add(int val) Adds a new test score val to the stream and returns the element representing the kth largest element in the pool of test scores so far.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * ["KthLargest", "add", "add", "add", "add", "add"]
 * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 * <p>
 * Output: [null, 4, 5, 5, 8, 8]
 * <p>
 * Explanation:
 * <p>
 * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
 * kthLargest.add(3); // return 4
 * kthLargest.add(5); // return 5
 * kthLargest.add(10); // return 5
 * kthLargest.add(9); // return 8
 * kthLargest.add(4); // return 8
 */
public class KthLargestElementInAStream {

    int k;
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        for(int num: nums){
            this.queue.offer(num);
        }
    }

    public int add(int val) {
        this.queue.offer(val);
        while(this.queue.size() > k) {
            queue.poll();
        }
        return this.queue.peek();
    }

    public static void main(String[] args) {
        KthLargestElementInAStream elementInAStream = new KthLargestElementInAStream(3, new int[]{4,5,8,2});
        elementInAStream.add(3);
        elementInAStream.add(5);
        elementInAStream.add(10);
        elementInAStream.add(9);
        elementInAStream.add(4);
    }
}
