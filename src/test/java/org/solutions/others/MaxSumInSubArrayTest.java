package org.solutions.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumInSubArrayTest {
    @Test
    void testGetMaxSum() {
        int[] arr = new int[]{3, 5, 2, 1, 7};
        int k = 2;
        int actual = MaxSumInSubArray.getMaxSum(k, arr);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxSum2() {
        int[] arr = new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int actual = MaxSumInSubArray.getMaxSum(k, arr);
        int expected = 39;
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxSum3() {
        int[] arr = new int[]{3, 7};
        int k = 2;
        int actual = MaxSumInSubArray.getMaxSum(k, arr);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxSum4() {
        int[] arr = new int[]{3, 7};
        int k = 3;
        int actual = MaxSumInSubArray.getMaxSum(k, arr);
        int expected = -1;
        assertEquals(expected, actual);
    }
}