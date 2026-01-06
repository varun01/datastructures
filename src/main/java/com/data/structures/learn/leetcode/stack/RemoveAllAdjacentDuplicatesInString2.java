package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
 * <p>
 * We repeatedly make k duplicate removals on s until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcd", k = 2
 * Output: "abcd"
 * Explanation: There's nothing to delete.
 * Example 2:
 * <p>
 * Input: s = "deeedbbcccbdaa", k = 3
 * Output: "aa"
 * Explanation:
 * First delete "eee" and "ccc", get "ddbbbdaa"
 * Then delete "bbb", get "dddaa"
 * Finally delete "ddd", get "aa"
 * Example 3:
 * <p>
 * Input: s = "pbbcggttciiippooaais", k = 2
 * Output: "ps"
 */
public class RemoveAllAdjacentDuplicatesInString2 {

    public static void main(String[] args) {
        String s = "pbbcggttciiippooaais";
        System.out.println(removeDuplicates(s, 2));
    }

    public static String removeDuplicates(String s, int k) {
        char[] arr = s.toCharArray();
        Deque<Pair> stack = new ArrayDeque<>();
        for(char c : arr) {
            if(stack.isEmpty()) {
                stack.offerLast(new Pair(c, 1));
            } else {
                Pair pair = stack.peekLast();
                if (pair.c == c){
                    if(pair.i + 1 == k) {
                        stack.pollLast();
                    } else {
                        Pair p = stack.pollLast();
                        p.i = p.i + 1;
                        stack.offerLast(p);
                    }
                } else {
                    stack.offerLast(new Pair(c, 1));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair p = stack.pollFirst();
            int i = p.i;
            while (i > 0) {
                sb.append(p.c);
                i--;
            }
        }
        return sb.toString();
    }

    public static class Pair {
        Character c;
        Integer i;
        Pair(Character c, Integer i) {
            this.c = c;
            this.i = i;
        }
    }
}
