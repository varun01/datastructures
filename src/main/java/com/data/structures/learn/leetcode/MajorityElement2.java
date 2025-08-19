package com.data.structures.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0};
        System.out.println(majorityElement(arr));
    }

    private static List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && candidate2 != nums[i]) {
                count1++;
                candidate1 = nums[i];
            } else if (count2 == 0 && candidate1 != nums[i]) {
                count2++;
                candidate2 = nums[i];
            } else if (candidate1 == nums[i]) {
                count1++;
            } else if (candidate2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            }
        }

        if (count1 > threshold) {
            result.add(candidate1);
        }
        if (count2 > threshold) {
            result.add(candidate2);
        }
        return result;
    }

}
