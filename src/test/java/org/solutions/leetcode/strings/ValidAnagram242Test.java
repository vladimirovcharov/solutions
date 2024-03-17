package org.solutions.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.solutions.leetcode.strings.ValidAnagram242.isAnagram;

class ValidAnagram242Test {
    @ParameterizedTest
    @CsvSource({"anagram, nagaram", "valid, ilavd"})
    void testAnagramTrue(String s1, String s2) {
        assertTrue(isAnagram(s1, s2));
    }

    @ParameterizedTest
    @CsvSource({"rat, car", "sport, pros"})
    void testAnagramFalse(String s1, String s2) {
        assertFalse(isAnagram(s1, s2));
    }
}