package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstMissingPositive41Test {

    @Test
    void test() {
        assertEquals(3, FirstMissingPositive41.firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(3, FirstMissingPositive41.firstMissingPositive2(new int[]{1, 2, 0}));
    }

    @Test
    void test2() {
        assertEquals(2, FirstMissingPositive41.firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(2, FirstMissingPositive41.firstMissingPositive2(new int[]{3, 4, -1, 1}));
    }

    @Test
    void test3() {
        assertEquals(1, FirstMissingPositive41.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        assertEquals(1, FirstMissingPositive41.firstMissingPositive2(new int[]{7, 8, 9, 11, 12}));
    }
}