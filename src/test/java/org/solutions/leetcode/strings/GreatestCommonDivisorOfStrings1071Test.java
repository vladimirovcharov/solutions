package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.leetcode.strings.GreatestCommonDivisorOfStrings1071.gcdOfStrings;

class GreatestCommonDivisorOfStrings1071Test {

    @Test
    void test() {
        assertEquals("ABC", gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    void test2() {
        assertEquals("AB", gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    void test3() {
        assertEquals("", gcdOfStrings("LEET", "CODE"));
    }

    @Test
    void test4() {
        assertEquals("", gcdOfStrings("ABABAB", "ABCD"));
    }

    @Test
    void test5() {
        assertEquals("TAUXX", gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    @Test
    void test6() {
        assertEquals("ABAB", gcdOfStrings("ABABABAB", "ABAB"));
    }

}