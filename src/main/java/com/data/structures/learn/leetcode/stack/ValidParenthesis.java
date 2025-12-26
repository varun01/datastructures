package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 */
public class ValidParenthesis {

    public static void main(String[] args) {
        String s = "()[]{})";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray()) {
            if(c == '{' || c == '[' || c== '(') {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
