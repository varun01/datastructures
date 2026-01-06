package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * <p>
 * Note that after backspacing an empty text, the text will continue empty.
 * <p>
 * Example 1:
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * <p>
 * Example 2:
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * <p>
 * Example 3:
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 */
public class BackspaceStringCompare {

    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Deque<Character> stackS = new ArrayDeque<>();
        Deque<Character> stackT = new ArrayDeque<>();
        addToStack(stackS, s);
        addToStack(stackT, t);
        boolean flag = true;
        if (stackS.size() != stackT.size())
            flag = false;
        else{
            while (!stackS.isEmpty() && !stackT.isEmpty()) {
                if(!stackS.pollLast().equals(stackT.pollLast())) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    private static void addToStack(Deque<Character> stack, String str) {
        char[] arr = str.toCharArray();
        for(char c : arr) {
            if(!stack.isEmpty() && c == '#') {
                stack.pollLast();
                continue;
            }
            if(c != '#')
                stack.offerLast(c);
        }
    }
}
