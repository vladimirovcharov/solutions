package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.leetcode.strings.ReverseWordsInAString151.reverseWords;

class ReverseWordsInAString151Test {

    @Test
    void testReversWords() {
        String actual = reverseWords("the sky is blue");
        String expected = "blue is sky the";
        assertEquals(expected, actual);
    }

    @Test
    void testReversWords2() {
        String actual = reverseWords("  hello world  ");
        String expected = "world hello";
        assertEquals(expected, actual);
    }

    @Test
    void testReversWords3() {
        String actual = reverseWords("a good   example");
        String expected = "example good a";
        assertEquals(expected, actual);
    }
}