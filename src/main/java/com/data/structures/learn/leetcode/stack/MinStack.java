package com.data.structures.learn.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * Implement the MinStack class:
 * <p>
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * <p>
 * Output
 * [null,null,null,null,-3,null,0,-2]
 * <p>
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 */
public class MinStack {


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }

    LinkedList<Integer> linkedList;
    LinkedList<Integer> minValueStack;
    public MinStack() {
        linkedList = new LinkedList<>();
        minValueStack = new LinkedList<>();
    }

    public void push(int val) {
        this.linkedList.addLast(val);
        if(this.minValueStack.isEmpty() || val == Math.min(minValueStack.peekLast(), val)) {
            minValueStack.addLast(val);
        }
    }

    public void pop() {
        int last = this.linkedList.pollLast();
        if(last == this.minValueStack.peekLast()){
            this.minValueStack.pollLast();
        }
    }

    public int top() {
        return this.linkedList.peekLast();
    }

    public int getMin() {
        return this.minValueStack.peekLast();
    }
}
