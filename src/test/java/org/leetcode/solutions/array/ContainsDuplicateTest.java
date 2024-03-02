package org.leetcode.solutions.array;

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
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}