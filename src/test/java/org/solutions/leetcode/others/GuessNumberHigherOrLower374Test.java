package org.solutions.leetcode.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLower374Test {

    @Test
    void testGuessNumber() {
        int pick = 140;
        GuessNumberHigherOrLower374 guess = new GuessNumberHigherOrLower374(pick);
        int actual = guess.guessNumber(200);
        assertEquals(pick, actual);
    }
}