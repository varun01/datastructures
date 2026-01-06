package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are given a string s, which contains stars *.
 * <p>
 * In one operation, you can:
 * <p>
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * <p>
 * Note:
 * <p>
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leet**cod*e"
 * Output: "lecoe"
 * Explanation: Performing the removals from left to right:
 * - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
 * - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
 * - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
 * There are no more stars, so we return "lecoe".
 * Example 2:
 * <p>
 * Input: s = "erase*****"
 * Output: ""
 * Explanation: The entire string is removed, so we return an empty string.
 */
public class RemovingStarsFromString {

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());
        assert removeStars("leet**cod*e").equals("lecoe") : "InvalidString";
    }

    public static String removeStars(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : arr) {
            if(!stack.isEmpty() && c == '*') {
                stack.pollLast();
            }
            if (c != '*')
                stack.offerLast(c);
        }
        if (stack.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pollFirst());
        return sb.toString();
    }

}
