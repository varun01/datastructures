package com.data.structures.learn.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String[] strs = {"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(strs));
        long endTime = System.currentTimeMillis();
    }

    /*private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        int firstLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int index = 0;
            int length = Math.min(firstLength, strs[i].length());
            while (index < firstLength) {
                if (index < length && startArr[index] != strs[i].charAt(index)) {
                    startArr[index] = 0;
                }
                if (index >= length) {
                    startArr[index] = 0;
                }
                index++;
            }
        }

        return new String(startArr, 0, length);
    }*/
}