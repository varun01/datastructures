package com.data.structures.learn.leetcode.binaysearch;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class KokoEatingBananas {

    public static void main(String[] args) {
        int[] pile = {3, 6, 7, 11};
        int hours = 8;
        System.out.println(minEatingSpeed(pile, hours));
    }

    private static int minEatingSpeed(int[] piles, int hours) {
        IntSummaryStatistics stats = Arrays.stream(piles).summaryStatistics();
        int left = stats.getMin();
        int right = stats.getMax();
        int result = right;

        while (left < right) {
            int mid = left+ (right - left)/2;
            if(getMinHours(piles, mid, hours)) {
                result = mid;
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return result;
    }

    private static boolean getMinHours(int[] piles, int speed, int totalHours) {
        long hours = 0;
        for( int pile : piles) {
            hours += pile/speed;
            if(pile%speed != 0)
                hours++;
        }
        return hours <= totalHours;
    }

}
