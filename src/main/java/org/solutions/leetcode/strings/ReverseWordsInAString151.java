package org.solutions.leetcode.strings;

public class ReverseWordsInAString151 {
    public static String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = split.length - 1; i > 0; i--) {
            sb.append(split[i]).append(" ");
        }

        sb.append(split[0]);

        return sb.toString();
    }
}
