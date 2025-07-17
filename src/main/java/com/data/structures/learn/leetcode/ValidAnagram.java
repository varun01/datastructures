package com.data.structures.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        List<Character> chars = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(t.charAt(i));
            chars.remove((Character) t.charAt(i));
        }
        return chars.isEmpty();
    }

}
