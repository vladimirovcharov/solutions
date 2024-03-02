package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{}));
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void shouldReturnTrue2() {
        assertTrue(ContainsDuplicate.containsDuplicate2(new int[]{1, 2, 3, 1}));
        assertTrue(ContainsDuplicate.containsDuplicate2(new int[]{1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    void shouldReturnFalse2() {
        assertFalse(ContainsDuplicate.containsDuplicate2(new int[]{}));
        assertFalse(ContainsDuplicate.containsDuplicate2(new int[]{1, 2, 3, 4}));
    }
}