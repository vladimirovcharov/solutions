package org.solutions.leetcode.others;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        assertEquals(List.of("()"), GenerateParentheses.generateParenthesis(1));
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), GenerateParentheses.generateParenthesis(3));
    }
}