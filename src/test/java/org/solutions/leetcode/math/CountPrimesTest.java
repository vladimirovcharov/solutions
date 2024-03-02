package org.solutions.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {
    @Test
    void countPrimes() {
        assertEquals(4, CountPrimes.countPrimes(10));
        assertEquals(0, CountPrimes.countPrimes(0));
        assertEquals(0, CountPrimes.countPrimes(1));
    }
}