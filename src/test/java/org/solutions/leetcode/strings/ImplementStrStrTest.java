package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {
    @Test
    void strStr() {
        assertEquals(0, ImplementStrStr.strStr("sadbutsad", "sad"));
        assertEquals(-1, ImplementStrStr.strStr("leetcode", "leeto"));
    }
}