package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

import com.data.structures.learn.leetcode.linkedlist.util.ArrayUtil;

/**
 * We are given an array asteroids of integers representing asteroids in a row. The indices of the asteroid in the array represent their relative position in space.
 * <p>
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
 * <p>
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 * <p>
 * Example 1:
 * <p>
 * Input: asteroids = [5,10,-5]
 * Output: [5,10]
 * Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
 * Example 2:
 * <p>
 * Input: asteroids = [8,-8]
 * Output: []
 * Explanation: The 8 and -8 collide exploding each other.
 * Example 3:
 * <p>
 * Input: asteroids = [10,2,-5]
 * Output: [10]
 * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 */
public class AsteroidCollision {

    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        ArrayUtil.printArray(asteroidCollision(asteroids));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int asteroid: asteroids) {
            removeOrInsertElement(dq, asteroid);
        }

        asteroids = new int[dq.size()];
        int i =0;
        while (!dq.isEmpty()) {
            asteroids[i++] = dq.pollFirst();
        }
        return asteroids;
    }

    private static void removeOrInsertElement(Deque<Integer> dq, int ele) {
        if(!dq.isEmpty() && dq.peekLast() > 0) {
            if ((dq.peekLast() < 0 && ele > 0) || (ele < 0)) {
                if(((dq.peekLast() + ele) == 0)) {
                    dq.pollLast();
                } else if (((dq.peekLast() + ele) < 0) && ele < 0) {
                    dq.pollLast();
                    removeOrInsertElement(dq, ele);
                } else if (((dq.peekLast() + ele) > 0) && dq.peekLast() < 0) {
                    dq.pollLast();
                    dq.addLast(ele);
                } else if (((dq.peekLast() + ele) > 0) && ele < 0) {

                } else {
                    dq.addLast(ele);
                }
            } else {
                dq.addLast(ele);
            }
        } else {
            dq.addLast(ele);
        }
    }
}
