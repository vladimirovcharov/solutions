package org.solutions.leetcode.strings;

public class MergeStringsAlternately1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; ;i++, j++) {
            if (i >= word2.length()) {
                sb.append(word1.substring(i));
                break;
            }
            if (j >= word1.length()) {
                sb.append(word2.substring(j));
                break;
            }
            sb.append(word1.charAt(i)).append(word2.charAt(j));
        }
        return sb.toString();
    }
}
