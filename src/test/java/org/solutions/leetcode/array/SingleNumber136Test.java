package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.leetcode.array.SingleNumber136.singleNumber;
import static org.solutions.leetcode.array.SingleNumber136.singleNumber2;

class SingleNumber136Test {

    @Test
    void testSingleNumber() {
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNumber(nums));
        assertEquals(1, singleNumber2(nums));
    }

    @Test
    void testSingleNumber2() {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        assertEquals(4, singleNumber(nums));
        assertEquals(4, singleNumber2(nums));
    }

    @Test
    void testSingleNumber3() {
        int[] nums = new int[]{1};
        assertEquals(1, singleNumber(nums));
        assertEquals(1, singleNumber2(nums));
    }
}