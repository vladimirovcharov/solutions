package org.solutions.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.solutions.leetcode.strings.MaximumNumberOfVowelsInASubstringOfGivenLength1456.*;

class MaximumNumberOfVowelsInASubstringOfGivenLength1456Test {

    @Test
    void test() {
        assertEquals(3, maxVowels("abciiidef", 3));
        assertEquals(3, maxVowels2("abciiidef", 3));
    }

    @Test
    void test2() {
        assertEquals(2, maxVowels("aeiou", 2));
        assertEquals(2, maxVowels2("aeiou", 2));
    }

    @Test
    void test3() {
        assertEquals(2, maxVowels("leetcode", 3));
        assertEquals(2, maxVowels2("leetcode", 3));
    }
}