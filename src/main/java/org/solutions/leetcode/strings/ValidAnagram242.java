package org.solutions.leetcode.strings;

import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return getMap(s).equals(getMap(t));
    }

    private static Map<Character, Long> getMap(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
