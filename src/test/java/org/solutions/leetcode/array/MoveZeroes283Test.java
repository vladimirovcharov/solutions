package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.solutions.leetcode.array.MoveZeroes283.moveZeroes;

class MoveZeroes283Test {

    @Test
    void testMoveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        int[] expected = new int[]{1, 3, 12, 0, 0};
        assertArrayEquals(expected, nums);
    }

    @Test
    void testMoveZeroes2() {
        int[] nums = new int[]{0};
        moveZeroes(nums);
        int[] expected = new int[]{0};
        assertArrayEquals(expected, nums);
    }

    @Test
    void testMoveZeroes3() {
        int[] nums = new int[]{2, 1};
        moveZeroes(nums);
        int[] expected = new int[]{2, 1};
        assertArrayEquals(expected, nums);
    }

    @Test
    void testMoveZeroes4() {
        int[] nums = new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes(nums);
        int[] expected = new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0};
        assertArrayEquals(expected, nums);
    }
}