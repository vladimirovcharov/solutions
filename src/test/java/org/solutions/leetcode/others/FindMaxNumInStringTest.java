package org.solutions.leetcode.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxNumInStringTest {

    @Test
    void findMaxInGroup() {
        assertEquals(25, FindMaxNumInString.findMaxInGroup("12asdasd25art"));
        assertEquals(62, FindMaxNumInString.findMaxInGroup("hf62ghf21rrtg50"));
    }
}