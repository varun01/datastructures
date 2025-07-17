package com.data.structures.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndDoubleExist {

    public static void main(String[] args) {
        int[] arr = {0,0};
        boolean result = checkIfExist(arr);
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
            if ((map.containsKey(arr[i] * 2)
                    || (arr[i] % 2 == 0
                            && map.containsKey(arr[i] / 2)))
                            && (i != map.get(arr[i] / 2))) {
                return true;
            }
        }
        return false;
    }
}
