package com.data.structures.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 * <p>
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 * <p>
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class FindAllAnagramsInAString {

    public static void main(String[] args) {
        System.out.println(findAnagrams("abab", "ab"));
    }

    private static List<Integer> findAnagrams(String s, String p) {
        int[] pArr = new int[26];
        int[] sArr = new int[26];
        char[] pChars = p.toCharArray();
        for (int i = 0; i < p.length(); i++) {
            pArr[p.charAt(i) - 'a']++;
            sArr[s.charAt(i) - 'a']++;
        }

        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = p.length() - 1;
        while (end < s.length()) {
            if(isAnagram(sArr, pArr, pChars)) {
                result.add(start);
            }
            sArr[s.charAt(start) - 'a']--;
            start++;
            end++;
            if(end == s.length()) break;
            sArr[s.charAt(end)- 'a']++;
        }
        return result;
    }

    private static boolean isAnagram(int[] sArr, int[] pArr, char[] pChars) {
        for (char pChar : pChars) {
            int index = pChar - 'a';
            if (pArr[index] != sArr[index]) {
                return false;
            }
        }
        return true;
    }

}
