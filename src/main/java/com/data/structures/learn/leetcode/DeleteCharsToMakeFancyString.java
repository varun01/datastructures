package com.data.structures.learn.leetcode;

public class DeleteCharsToMakeFancyString {

    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char prevChar = '\0'; // Initialize with a character that won't match

        for(char c: s.toCharArray()) {
            if(count == 0) {
                prevChar = c;
            }
            if(c == prevChar && count < 2){
                count++;
                sb.append(c);
            } else if(c != prevChar) {
                prevChar = c;
                count = 1;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aaabaaaa";
        String result = makeFancyString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result); // Expected: "leetcode"
    }
}
