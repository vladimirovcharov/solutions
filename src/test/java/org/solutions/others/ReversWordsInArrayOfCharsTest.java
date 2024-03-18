package org.solutions.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.solutions.others.ReversWordsInArrayOfChars.reversWordsInCharArray;

class ReversWordsInArrayOfCharsTest {

    @Test
    void testReversWords() {
        char[] inputArray = {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};

        reversWordsInCharArray(inputArray);

        char[] expectedArray = {'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'e', 'r', 'f', 'e', 'c', 't'};

        assertArrayEquals(expectedArray, inputArray);
    }
}