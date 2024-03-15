package org.solutions.leetcode.strings;

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        if (s.isBlank()) {
            return true;
        }
        String modified = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
        return modified.contentEquals(new StringBuilder(modified).reverse());
    }
}
