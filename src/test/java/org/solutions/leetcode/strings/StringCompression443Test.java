package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompression443Test {

    @Test
    void test() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, StringCompression443.compress(chars));
    }

    @Test
    void test2() {
        char[] chars = {'a'};
        assertEquals(1, StringCompression443.compress(chars));
    }

    @Test
    void test3() {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, StringCompression443.compress(chars));
    }

    @Test
    void test4() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
        assertEquals(7, StringCompression443.compress(chars));
    }
}