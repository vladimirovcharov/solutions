package org.solutions.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindrome125Test {

    @ParameterizedTest
    @ValueSource(strings = { "A man, a plan, a canal: Panama", " ", "madam", "" })
    void isPalindrome(String s) {
        assertTrue(ValidPalindrome125.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = { "race a car", "not a palindrome" })
    void isNotPalindrome(String s) {
        assertFalse(ValidPalindrome125.isPalindrome(s));
    }
}