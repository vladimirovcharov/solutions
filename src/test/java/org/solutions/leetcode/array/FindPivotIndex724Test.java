package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndex724Test {

    @Test
    void test() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivotIndex = FindPivotIndex724.pivotIndex(nums);
        assertEquals(3, pivotIndex);
    }

    @Test
    void test2() {
        int[] nums = {1, 2, 3};
        int pivotIndex = FindPivotIndex724.pivotIndex(nums);
        assertEquals(-1, pivotIndex);
    }

    @Test
    void test3() {
        int[] nums = {2, 1, -1};
        int pivotIndex = FindPivotIndex724.pivotIndex(nums);
        assertEquals(0, pivotIndex);
    }
}