package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.solutions.leetcode.strings.IsSubsequence392.isSubsequence;

class IsSubsequence392Test {

    @Test
    void testTrue() {
        assertTrue(isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void testTrue2() {
        assertTrue(isSubsequence("", "ahbgdc"));
    }

    @Test
    void testTrue3() {
        assertTrue(isSubsequence("b", "abc"));
    }

    @Test
    void testTrue4() {
        assertTrue(isSubsequence("ab", "baab"));
    }

    @Test
    void testTrue5() {
        assertTrue(isSubsequence("leetcode", "yyylyyyeyyyyeyyytyyycyyyoyyydyyyye"));
    }

    @Test
    void testFalse() {
        assertFalse(isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void testFalse3() {
        assertFalse(isSubsequence("abc", ""));
    }
}