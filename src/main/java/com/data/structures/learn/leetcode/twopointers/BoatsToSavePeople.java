package com.data.structures.learn.leetcode.twopointers;

import java.util.Arrays;

/**
 * You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
 * <p>
 * Return the minimum number of boats to carry every given person.
 * <p>
 * Example 1:
 * <p>
 * Input: people = [1,2], limit = 3
 * Output: 1
 * Explanation: 1 boat (1, 2)
 * Example 2:
 * <p>
 * Input: people = [3,2,2,1], limit = 3
 * Output: 3
 * Explanation: 3 boats (1, 2), (2) and (3)
 * Example 3:
 * <p>
 * Input: people = [3,5,3,4], limit = 5
 * Output: 4
 * Explanation: 4 boats (3), (3), (4), (5)
 */
public class BoatsToSavePeople {

    public static void main(String[] args) {
        int[] people = {3, 5, 3, 4};
        Arrays.sort(people);
        System.out.println(numRescueBoats(people, 5));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int left = 0;
        int right = people.length - 1;
        while ( left <= right) {
            int remaining = limit - people[right--];
            if(left < right && people[left] <= remaining) {
                left++;
            }
            count++;
        }
        return count;
    }

}
