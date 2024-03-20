package org.solutions.leetcode.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairs746Test {

    @Test
    void test() {
        int[] cost = {10, 15, 20};
        assertEquals(15, MinCostClimbingStairs746.minCostClimbingStairs(cost));
    }

    @Test
    void test2() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, MinCostClimbingStairs746.minCostClimbingStairs(cost));
    }
}