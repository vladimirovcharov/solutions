package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.leetcode.strings.LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring;

class LongestSubstringWithoutRepeatingCharacters3Test {

    @Test
    void testLengthOfLongestSubstring() {
        int actual = lengthOfLongestSubstring("abcabcbb");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring2() {
        int actual = lengthOfLongestSubstring("bbbbb");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring3() {
        int actual = lengthOfLongestSubstring("pwwkew");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring4() {
        int actual = lengthOfLongestSubstring(" ft t mot  ");
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring5() {
        int actual = lengthOfLongestSubstring("");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring6() {
        int actual = lengthOfLongestSubstring(null);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring7() {
        int actual = lengthOfLongestSubstring(" ");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring8() {
        int actual = lengthOfLongestSubstring("  ");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring9() {
        int actual = lengthOfLongestSubstring("au");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring10() {
        int actual = lengthOfLongestSubstring("aab");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void testLengthOfLongestSubstring11() {
        int actual = lengthOfLongestSubstring("ckilbkd");
        int expected = 5;
        assertEquals(expected, actual);
    }
}