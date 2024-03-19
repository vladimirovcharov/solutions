package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayI643Test {

    @Test
    void test() {
        double actual = MaximumAverageSubarrayI643.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        double expected = 12.75000;
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        double actual = MaximumAverageSubarrayI643.findMaxAverage(new int[]{5}, 1);
        double expected = 5.00000;
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        double actual = MaximumAverageSubarrayI643.findMaxAverage(new int[]{50, 12, -5, -6, 1, 3}, 3);
        double expected = 19.00000;
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        double actual = MaximumAverageSubarrayI643.findMaxAverage(new int[]{-1}, 1);
        double expected = -1.00000;
        assertEquals(expected, actual);
    }
}