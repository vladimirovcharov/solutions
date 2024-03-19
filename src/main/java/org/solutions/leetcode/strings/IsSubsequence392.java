package org.solutions.leetcode.strings;

public class IsSubsequence392 {
    public static boolean isSubsequence(String s, String t) {
        for (int i = 0, index = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            index = t.indexOf(c, index);
            if (index == -1) {
                return false;
            }
            index++;
        }
        return true;
    }
}
