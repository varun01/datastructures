package com.data.structures.learn.leetcode.twopointers;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * <p>
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        char[] arr = new char[s.length()];
        int arrIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <='9')) {
                arr[arrIndex++] = c;
            } else if (c >= 'A' && c <= 'Z') {
                arr[arrIndex++] = (char) (c + 32);
            }
        }
        String result = new String(arr, 0, arrIndex);
        int left = 0;
        int right = result.length() - 1;
        while(left <= right) {
            if(result.charAt(left) != result.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
