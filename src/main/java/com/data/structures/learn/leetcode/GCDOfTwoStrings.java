package com.data.structures.learn.leetcode;

public class GCDOfTwoStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    private static String gcdOfStrings(String str1, String str2) {
        int gcd = gcdOfTwoNumbers(str1.length(), str2.length());
        String gcdStr = str1.substring(0, gcd);
        String str11 = gcdStr.repeat(str1.length()/gcd);
        String str22 = gcdStr.repeat(str2.length()/gcd);
        if(str11.equals(str22)) {
            return gcdStr;
        }
        return "";
    }

    private static int gcdOfTwoNumbers(int num1, int num2) {
        int min = num1>num2 ? num2 : num1;
        while(min > 0) {
            if(num1%min== 0 && num2%min == 0) {
                return min;
            }
            min--;
        }
        return 0;
    }
}
