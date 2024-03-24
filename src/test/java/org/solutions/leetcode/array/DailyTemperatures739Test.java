package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperatures739Test {

    @Test
    void test() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] actual = DailyTemperatures739.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] temperatures = {30, 40, 50, 60};
        int[] expected = {1, 1, 1, 0};
        int[] actual = DailyTemperatures739.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] temperatures = {30, 60, 90};
        int[] expected = {1, 1, 0};
        int[] actual = DailyTemperatures739.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test4() {
        int[] temperatures = {89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        int[] expected = {8, 1, 5, 4, 3, 2, 1, 1, 0, 0};
        int[] actual = DailyTemperatures739.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }
}