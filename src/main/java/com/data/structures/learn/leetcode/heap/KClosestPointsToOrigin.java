package com.data.structures.learn.leetcode.heap;

import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */
public class KClosestPointsToOrigin {

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> squaredDis(a) - squaredDis(b));
        for(int[] point: points) {
            queue.offer(point);
            while(queue.size() > k) {
                queue.poll();
            }
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++)
            res[i] = queue.poll();
        return res;
    }

    public int squaredDis(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }

}
