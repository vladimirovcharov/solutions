package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.solutions.leetcode.array.JumpGame55.canJump;

class JumpGameTest {
    @Test
    void testCanJump() {
        assertTrue(canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(canJump(new int[]{3, 2, 1, 0, 4}));
        assertFalse(canJump(new int[]{0, 2, 3}));
        assertTrue(canJump(new int[]{2, 0}));
        assertTrue(canJump(new int[]{0}));
        assertFalse(canJump(new int[]{1, 0, 1, 0}));
        assertTrue(canJump(new int[]{2, 0, 0}));
        assertTrue(canJump(new int[]{2, 5, 0, 0}));
    }
}