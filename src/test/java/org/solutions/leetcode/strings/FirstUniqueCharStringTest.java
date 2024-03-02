package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharStringTest {
    @Test
    void firstUniqChar() {
        assertEquals(0, FirstUniqueCharString.firstUniqChar("leetcode"));
        assertEquals(2, FirstUniqueCharString.firstUniqChar("loveleetcode"));
        assertEquals(-1, FirstUniqueCharString.firstUniqChar("aabb"));
    }
}