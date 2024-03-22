package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniqueNumberOfOccurrences1207Test {

    @Test
    void testTrue() {
        int[] arr = {1, 2, 2, 1, 1, 3};
        assertTrue(UniqueNumberOfOccurrences1207.uniqueOccurrences(arr));
        assertTrue(UniqueNumberOfOccurrences1207.uniqueOccurrences2(arr));
    }

    @Test
    void testTrue2() {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertTrue(UniqueNumberOfOccurrences1207.uniqueOccurrences(arr));
        assertTrue(UniqueNumberOfOccurrences1207.uniqueOccurrences2(arr));
    }

    @Test
    void testFalse() {
        int[] arr = {1, 2};
        assertFalse(UniqueNumberOfOccurrences1207.uniqueOccurrences(arr));
        assertFalse(UniqueNumberOfOccurrences1207.uniqueOccurrences2(arr));
    }
}