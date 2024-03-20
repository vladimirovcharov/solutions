package org.solutions.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumber1137Test {

    @Test
    void test() {
        assertEquals(4, NthTribonacciNumber1137.tribonacci(4));
    }

    @Test
    void test2() {
        assertEquals(1389537, NthTribonacciNumber1137.tribonacci(25));
    }
}