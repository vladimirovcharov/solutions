package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.solutions.leetcode.array.CanPlaceFlowers605.canPlaceFlowers;

class CanPlaceFlowers605Test {

    @Test
    void testTrue() {
        assertTrue(canPlaceFlowers(new int[]{0}, 1));
    }

    @Test
    void testTrue2() {
        assertTrue(canPlaceFlowers(new int[]{0,0,1,0,1}, 1));
    }

    @Test
    void testTrue3() {
        assertTrue(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }

    @Test
    void testTrue4() {
        assertTrue(canPlaceFlowers(new int[]{1,0,0,0,0,0,0,0,1}, 3));
    }

    @Test
    void testTrue5() {
        assertTrue(canPlaceFlowers(new int[]{0,0}, 1));
    }

    @Test
    void testFalse() {
        assertFalse(canPlaceFlowers(new int[]{1,0}, 1));
    }

    @Test
    void testFalse2() {
        assertFalse(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

    @Test
    void testFalse3() {
        assertFalse(canPlaceFlowers(new int[]{1,0,0,0,0,0,0,1}, 3));
    }

    @Test
    void testFalse4() {
        assertFalse(canPlaceFlowers(new int[]{1,0,1,0,1,0,1}, 1));
    }
}