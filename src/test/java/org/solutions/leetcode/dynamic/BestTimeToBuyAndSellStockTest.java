package org.solutions.leetcode.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit2() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit2(new int[]{7, 6, 4, 3, 1}));
        assertEquals(1, BestTimeToBuyAndSellStock.maxProfit2(new int[]{1, 2}));
    }
}