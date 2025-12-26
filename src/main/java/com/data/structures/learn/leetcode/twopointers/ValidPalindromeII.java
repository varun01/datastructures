package com.data.structures.learn.leetcode.twopointers;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aba"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * Example 3:
 * <p>
 * Input: s = "abc"
 * Output: false
 */

public class ValidPalindromeII {

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return checkPalindrome(s, i +1, j) || checkPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean checkPalindrome(String s, int start, int end) {
        int i = start;
        int j = end;
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

}
