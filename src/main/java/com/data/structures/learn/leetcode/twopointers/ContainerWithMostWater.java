package com.data.structures.learn.leetcode.twopointers;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Notice that you may not slant the container.
 * <p>
 * Example 1:
 * <p>
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
            int leftH = height[left];
            int rightH = height[right];
            int minHeight = Math.min(leftH, rightH);
            int result = minHeight * (right - left); // (right - left) is breadth
            area = area > result ? area : result;

            if (leftH < rightH) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }

}
