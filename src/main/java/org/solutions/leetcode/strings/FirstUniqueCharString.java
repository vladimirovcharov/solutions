package org.solutions.leetcode.strings;

public class FirstUniqueCharString {
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
