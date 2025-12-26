package com.data.structures.learn.leetcode.heap;

import java.util.PriorityQueue;

/**
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 * <p>
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
 * <p>
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 * <p>
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 * <p>
 * Example 1:
 * <p>
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
 * Example 2:
 * <p>
 * Input: stones = [1]
 * Output: 1
 */
public class LastStoneWeight {

    public static void main(String[] args) {
        int[] nums = {2,2,3};
        System.out.println(lastStoneWeight(nums));
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int firstStone = queue.poll();
            int secondStone = queue.poll();
            if (secondStone < firstStone) {
                queue.offer( firstStone - secondStone);
            }
        }
        return queue.size() == 1 ? queue.poll() : 0;
    }

}
