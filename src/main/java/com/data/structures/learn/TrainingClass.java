package com.data.structures.learn;

import java.util.Arrays;
import java.util.PriorityQueue;

import com.data.structures.learn.leetcode.linkedlist.util.ArrayUtil;

public class TrainingClass {


    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(19);
        queue.add(20);
        queue.add(1);
        queue.add(11);
        queue.add(9);
        queue.add(13);
        queue.add(12);
        queue.add(21);
        Object[] result = queue.toArray();
        ArrayUtil.printArray(result);
        System.out.println(result[result.length/2]);
        ArrayUtil.printArray(Arrays.stream(queue.toArray()).sorted().toArray());
        result = Arrays.stream(queue.toArray()).sorted().toArray();
        System.out.println(result[result.length/2]);
    }

}
