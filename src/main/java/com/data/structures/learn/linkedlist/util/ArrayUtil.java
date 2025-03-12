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

    public static void printArrayWithIndex(int[] array) {
        StringJoiner joiner = new StringJoiner(",");
        StringJoiner indexJoiner = new StringJoiner(",");
        for(int i = 0; i < array.length; i++) {
            joiner.add(String.valueOf(array[i]));
            indexJoiner.add(String.valueOf(i));
        }
        System.out.println("[" + joiner + "]\n[" + indexJoiner + "]");
    }
}
