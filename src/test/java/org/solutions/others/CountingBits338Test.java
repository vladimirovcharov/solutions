package org.solutions.others;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingBits338Test {

    @Test
    void test() {
        assertArrayEquals(new int[]{0, 1, 1}, CountingBits338.countBits(2));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, CountingBits338.countBits(5));
    }
}