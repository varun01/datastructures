package com.data.structures.learn.linkedlist.util;

import java.util.StringJoiner;

public class ArrayUtil {

    public static void printArray(int[] array) {
        StringJoiner joiner = new StringJoiner(",");
        for (int j : array) {
            joiner.add(String.valueOf(j));
        }
        System.out.println("[" + joiner + "]");
    }
}
