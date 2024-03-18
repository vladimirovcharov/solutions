package org.solutions.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversWordsInArrayTest {
    @Test
    void testReversWords() {
        String actual = ReversWordsInArray.reversWords("perfect makes practice");
        String expected = "practice makes perfect";
        assertEquals(expected, actual);
    }
}