package com.data.structures.learn.leetcode;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 *
 * Example 1:
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 *
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        for(int i =0; i< t.length(); i++) {
            if(sPointer < s.length() && t.charAt(i) == s.charAt(sPointer)) {
                sPointer++;
            }
        }
        return s.length() == sPointer;
    }
}
