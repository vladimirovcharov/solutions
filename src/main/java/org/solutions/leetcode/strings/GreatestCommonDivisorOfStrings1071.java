package org.solutions.leetcode.strings;

public class GreatestCommonDivisorOfStrings1071 {
    public static String gcdOfStrings(String str1, String str2) {
        return str1.concat(str2).equals(str2.concat(str1)) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
