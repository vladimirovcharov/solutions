package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitude1732Test {

    @Test
    void test() {
        assertEquals(1, FindTheHighestAltitude1732.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    @Test
    void test2() {
        assertEquals(0, FindTheHighestAltitude1732.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}