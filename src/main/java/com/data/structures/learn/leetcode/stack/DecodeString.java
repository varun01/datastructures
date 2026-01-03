package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 * <p>
 * The test cases are generated so that the length of the output will never exceed 105.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 * <p>
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 * <p>
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 */
public class DecodeString {

    public static void main(String[] args) {
        System.out.println(decodeString("100[leetcode]"));
    }

    public static String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        while(i<s.length()) {
            if(s.charAt(i) == ']') {
                StringBuilder sb= new StringBuilder();
                while(!stack.isEmpty() && stack.peekLast() != '[') {
                    sb.append(stack.pollLast());
                }
                stack.pollLast();
                sb.reverse();
                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && stack.peekLast() >= '0' && stack.peekLast() <= '9') {
                    num.append(stack.pollLast());
                }
                num.reverse();
                int number = Integer.parseInt(num.toString());
                StringBuilder result = new StringBuilder();
                String str = sb.toString();
                while ( number > 0) {
                    result.append(str);
                    number--;
                }
                int j = 0;
                while( j < result.length()) {
                    stack.offerLast(result.charAt(j++));
                }
            } else {
                stack.offerLast(s.charAt(i));
            }
            i++;
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pollFirst());
        }
        return result.toString();
    }

}
