package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

import com.data.structures.learn.leetcode.linkedlist.util.ArrayUtil;

/**
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
 * <p>
 * Example 1:
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * Example 2:
 * <p>
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * <p>
 * Example 3:
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 */
public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temps = {89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        ArrayUtil.printArray(dailyTemperatures(temps));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] answers = new int[length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peekLast()] < temperatures[i]) {
                int index = stack.pollLast();
                answers[index] = i - index;
            }
            stack.offerLast(i);
        }
        return answers;
    }

}
