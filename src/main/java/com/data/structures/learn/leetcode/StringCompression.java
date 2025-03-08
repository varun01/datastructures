package com.data.structures.learn.leetcode;

public class StringCompression {

    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b','b','c','c','d', ' '};
        System.out.println(compress(arr));
    }

    private static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        StringBuilder str = new StringBuilder();
        int count = 1;
        char temp = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(temp == chars[i]) {
                count++;
            } else {
                str = str.append(temp);
                str = count == 1 ? str : str.append(count);
                temp = chars[i];
                count = 1;
            }
        }
        System.out.println(str);
        return str.length();
    }
}
