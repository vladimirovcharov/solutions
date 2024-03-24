package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDuplicateNumber287Test {

    @Test
    void test() {
        assertEquals(2, FindTheDuplicateNumber287.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        assertEquals(2, FindTheDuplicateNumber287.findDuplicate2(new int[]{1, 3, 4, 2, 2}));
    }

    @Test
    void test2() {
        assertEquals(3, FindTheDuplicateNumber287.findDuplicate(new int[]{3,1,3,4,2}));
        assertEquals(3, FindTheDuplicateNumber287.findDuplicate2(new int[]{3,1,3,4,2}));
    }

    @Test
    void test3() {
        assertEquals(3, FindTheDuplicateNumber287.findDuplicate(new int[]{3,3,3,3,3}));
        assertEquals(3, FindTheDuplicateNumber287.findDuplicate2(new int[]{3,3,3,3,3}));
    }
}