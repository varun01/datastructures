package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 * <p>
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 * <p>
 * An integer x.
 * Record a new score of x.
 * '+'.
 * Record a new score that is the sum of the previous two scores.
 * 'D'.
 * Record a new score that is the double of the previous score.
 * 'C'.
 * Invalidate the previous score, removing it from the record.
 * Return the sum of all the scores on the record after applying all the operations.
 * <p>
 * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
 * <p>
 * Example 1:
 * <p>
 * Input: ops = ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "2" - Add 2 to the record, record is now [5, 2].
 * "C" - Invalidate and remove the previous score, record is now [5].
 * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
 * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
 * The total sum is 5 + 10 + 15 = 30.
 */
public class BaseballGame {

    public static void main(String[] args) {

    }

    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pollLast();
            } else if (op.equals("D")) {
                stack.add(2 * stack.peekLast());
            } else if (op.equals("+")) {
                int lastEle = stack.pollLast();
                int peek = stack.peekLast();
                stack.add(lastEle);
                stack.add(lastEle + peek);
            } else {
                stack.add(Integer.valueOf(op));
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

}
