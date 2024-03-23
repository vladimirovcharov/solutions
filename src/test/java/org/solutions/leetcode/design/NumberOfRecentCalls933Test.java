package org.solutions.leetcode.design;

import org.junit.jupiter.api.Test;
import org.solutions.leetcode.design.NumberOfRecentCalls933.RecentCounter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfRecentCalls933Test {

    @Test
    void test() {
        RecentCounter recentCounter = new RecentCounter();

        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
    }
}