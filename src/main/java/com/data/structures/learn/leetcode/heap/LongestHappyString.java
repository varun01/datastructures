package com.data.structures.learn.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * A string s is called happy if it satisfies the following conditions:
 * <p>
 * s only contains the letters 'a', 'b', and 'c'.
 * s does not contain any of "aaa", "bbb", or "ccc" as a substring.
 * s contains at most a occurrences of the letter 'a'.
 * s contains at most b occurrences of the letter 'b'.
 * s contains at most c occurrences of the letter 'c'.
 * Given three integers a, b, and c, return the longest possible happy string. If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string "".
 * <p>
 * A substring is a contiguous sequence of characters within a string.
 */
public class LongestHappyString {

    public static void main(String[] args) {
        System.out.println(longestDiverseString(1,1,7));
    }

    public static String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>((a1,a2) -> a2.getValue() - a1.getValue());
        Map<String, Integer> map = new HashMap<>();
        map.put("a", a);
        map.put("b", b);
        map.put("c", c);
        map.entrySet().forEach(q::offer);
        StringBuilder builder =  new StringBuilder();

        while(!q.isEmpty()) {
            Map.Entry<String, Integer> entry = q.poll();
            int count = 0;
            int entryValue = entry.getValue();
            while(entryValue > 0 && count < 2) {
                builder.append(entry.getKey());
                entryValue--;
                count++;
            }

            if(!q.isEmpty()) {
                Map.Entry<String, Integer> entry2 = q.poll();
                int count2 = 0;
                int entryValue2 = entry2.getValue();
                while(entryValue2 > 0 && count2 < 2) {
                    builder.append(entry2.getKey());
                    entryValue2--;
                    count2++;
                }
                if(entryValue2 > 0) {
                    entry2.setValue(entryValue2);
                    q.offer(entry2);
                }
            }

            if(entryValue > 0) {
                entry.setValue(entryValue);

                q.offer(entry);
            }
        }
        return builder.toString();
    }
}
