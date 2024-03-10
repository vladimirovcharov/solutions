package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicates26Test {
    @Test
    void testRemoveDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int numOfUniqueElements = RemoveDuplicates26.removeDuplicates(nums);
        assertEquals(5, numOfUniqueElements);
    }
}