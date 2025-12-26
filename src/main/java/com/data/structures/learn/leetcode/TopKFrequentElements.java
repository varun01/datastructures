package com.data.structures.learn.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import com.data.structures.learn.leetcode.linkedlist.util.ArrayUtil;

public class TopKFrequentElements {

    private static int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) {
            return nums;
        }
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            maxHeap.offer(entry);
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            result[i] = entry.getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        ArrayUtil.printArray(result);
    }
}
