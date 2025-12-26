package com.data.structures.learn.leetcode.twopointers;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        printCharArr(s);
        printCharArr(reverseString(s));
    }

    public static char[] reverseString(char[] s) {
        char temp;
        int firstPtr = 0;
        int lastPtr = s.length - 1;
        while(firstPtr <= lastPtr) {
            temp = s[firstPtr];
            s[firstPtr] = s[lastPtr];
            s[lastPtr] = temp;
            firstPtr++;
            lastPtr--;
        }
        return s;
    }

    private static void printCharArr(char[] arr) {
        for (char c : arr) {
            System.out.print(c+"\t");
        }
        System.out.println();
    }
}
