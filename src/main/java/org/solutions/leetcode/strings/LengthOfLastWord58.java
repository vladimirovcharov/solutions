package org.solutions.leetcode.strings;

public class LengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isAlphabetic(chars[i])) {
                if (i > 0 && Character.isWhitespace(chars[i - 1])) {
                    return ++length;
                } else {
                    length++;
                }
            }

        }
        return length;
    }

    public static int lengthOfLastWord2(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length - 1].length();
    }
}
