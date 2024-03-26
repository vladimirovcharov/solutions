package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.leetcode.strings.LengthOfLastWord58.lengthOfLastWord;
import static org.solutions.leetcode.strings.LengthOfLastWord58.lengthOfLastWord2;

class LengthOfLastWord58Test {
    @Test
    void test() {
        assertEquals(5, lengthOfLastWord("Hello World"));
        assertEquals(5, lengthOfLastWord2("Hello World"));
    }

    @Test
    void test2() {
        assertEquals(4, lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(4, lengthOfLastWord2("   fly me   to   the moon  "));
    }

    @Test
    void test3() {
        assertEquals(6, lengthOfLastWord("luffy is still joyboy"));
        assertEquals(6, lengthOfLastWord2("luffy is still joyboy"));
    }
}