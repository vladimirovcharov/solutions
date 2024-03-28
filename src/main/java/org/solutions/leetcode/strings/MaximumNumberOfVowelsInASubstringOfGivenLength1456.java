package org.solutions.leetcode.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength1456 {

    public static int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] chars = s.toCharArray();
        int max = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < chars.length) {
            if (vowels.contains(chars[right])) {
                count++;
            }
            if (right - left == k - 1) {
                max = Math.max(max, count);
                if (vowels.contains(chars[left])) {
                    count--;
                }
                left++;
            }
            right++;
        }

        return max;
    }

    public static int maxVowels2(String s, int k) {
        int vowel = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowel++;
            }
        }
        int max = vowel;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowel++;
            }
            if (isVowel(s.charAt(i - k))) {
                vowel--;
            }
            max = Math.max(max, vowel);
        }
        return max;
    }

    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
