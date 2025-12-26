package com.data.structures.learn.leetcode.twopointers;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 * Example 1:
 * <p>
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 */
public class MergeStringAlternatively {

    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "xyz";
        System.out.println(w2.length());
        System.out.println(mergeAlternately(w1, w2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int w1Len = word1.length();
        int w2Len = word2.length();
        char[] arr = new char[w1Len + w2Len];
        int arrIndex = 0;
        while (i < w1Len && j < w2Len) {
            arr[arrIndex++] = word1.charAt(i++);
            arr[arrIndex++] = word2.charAt(j++);
        }
        if (i < w1Len) {
            while (i < w1Len) {
                arr[arrIndex++] = word1.charAt(i++);
            }
        }
        if (j < w2Len) {
            while (j < w2Len) {
                arr[arrIndex++] = word2.charAt(j++);
            }
        }
        return new String(arr);
    }

}
