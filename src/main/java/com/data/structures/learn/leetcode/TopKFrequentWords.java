package com.data.structures.learn.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> result = topKFrequent(words, k);
        System.out.println(result);
    }

    private static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue()) ? a.getKey().compareTo(b.getKey()) : a.getValue() - b.getValue()
        );

        for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<String> result = new java.util.ArrayList<>();
        return null;
    }
}
