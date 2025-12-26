package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * The Leetcode file system keeps a log each time some user performs a change folder operation.
 * <p>
 * The operations are described below:
 * <p>
 * "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
 * "./" : Remain in the same folder.
 * "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
 * You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
 * <p>
 * The file system starts in the main folder, then the operations in logs are performed.
 * <p>
 * Return the minimum number of operations needed to go back to the main folder after the change folder operations.
 */
public class CrawlerLogFolder {

    public int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();
        for(String log : logs) {
            if(log.equals("../") && !stack.isEmpty()) {
                stack.pollLast();
            } else if(!log.equals("./")) {
                stack.add(log);
            }
        }
        return stack.size();
    }
}
