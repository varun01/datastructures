package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * <p>
 * Implement the MyQueue class:
 * <p>
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 1, 1, false]
 * <p>
 * Explanation
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1); // queue is: [1]
 * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
 * myQueue.peek(); // return 1
 * myQueue.pop(); // return 1, queue is [2]
 * myQueue.empty(); // return false
 */
public class ImplementQueueUsingStack {

    Deque<Integer> inputQueue;
    Deque<Integer> outputQueue;
    public static void main(String[] args) {

    }

    public ImplementQueueUsingStack() {
        inputQueue = new ArrayDeque<>();
        outputQueue = new ArrayDeque<>();
    }

    public void push(int x) {
        while(!outputQueue.isEmpty()) {
            inputQueue.offerLast(outputQueue.pollLast());
        }
        inputQueue.offerLast(x);
    }

    public int pop() {
        while(!inputQueue.isEmpty()){
            outputQueue.offerLast(inputQueue.pollLast());
        }
        return outputQueue.pollLast();
    }

    public int peek() {
        if (!inputQueue.isEmpty() || outputQueue.isEmpty()) {
            while (!inputQueue.isEmpty()) {
                outputQueue.offerLast(inputQueue.pollLast());
            }
        }
        return outputQueue.peekLast();
    }

    public boolean empty() {
        return inputQueue.isEmpty() && outputQueue.isEmpty();
    }
}
