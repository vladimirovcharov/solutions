package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.leetcode.strings.ReverseVowelsOfAString345.reverseVowels;

class ReverseVowelsOfAString345Test {

    @Test
    void test() {
        assertEquals("holle", reverseVowels("hello"));
    }

    @Test
    void test2() {
        assertEquals("leotcede", reverseVowels("leetcode"));
    }

    @Test
    void test3() {
        assertEquals("a", reverseVowels("a"));
    }

    @Test
    void test4() {
        assertEquals("aA", reverseVowels("Aa"));
    }

    @Test
    void test5() {
        assertEquals("a man, a plan, a canal: PanamA", reverseVowels("A man, a plan, a canal: Panama"));
    }

    @Test
    void test6() {
        assertEquals("Yo! Bottoms Up, u.S. Motto, boy!", reverseVowels("Yo! Bottoms up, U.S. Motto, boy!"));
    }
}