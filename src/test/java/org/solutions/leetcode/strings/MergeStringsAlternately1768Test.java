package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternately1768Test {

    @Test
    void testMerge() {
        String merged = MergeStringsAlternately1768.mergeAlternately("abc", "pqr");
        assertEquals("apbqcr", merged);
    }

    @Test
    void testMerge2() {
        String merged = MergeStringsAlternately1768.mergeAlternately("ab", "pqrs");
        assertEquals("apbqrs", merged);
    }

    @Test
    void testMerge3() {
        String merged = MergeStringsAlternately1768.mergeAlternately("abcd", "pq");
        assertEquals("apbqcd", merged);
    }

    @Test
    void testMerge4() {
        String merged = MergeStringsAlternately1768.mergeAlternately("a", "p");
        assertEquals("ap", merged);
    }

    @Test
    void testMerge5() {
        String merged = MergeStringsAlternately1768.mergeAlternately("", "p");
        assertEquals("p", merged);
    }

}