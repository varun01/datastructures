package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * <p>
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * <p>
 * Note that:
 * <p>
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 * <p>
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 * <p>
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */
public class EvaludateReversePolishNotation {

    public static void main(String[] args) {

    }

    public int evalRPN(String[] tokens) {
        Deque<Integer> integers = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int second = integers.pollLast();
                int first = integers.pollLast();
                integers.addLast(first + second);
            } else if (token.equals("-")) {
                int second = integers.pollLast();
                int first = integers.pollLast();
                integers.addLast(first - second);
            } else if (token.equals("*")) {
                int second = integers.pollLast();
                int first = integers.pollLast();
                integers.addLast(first * second);
            } else if (token.equals("/")) {
                int second = integers.pollLast();
                int first = integers.pollLast();
                integers.addLast(first / second);
            } else {
                integers.addLast(Integer.valueOf(token));
            }
        }
        return integers.peek();
    }

}
