package org.solutions.leetcode.others;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.leetcode.others.GenerateParentheses22.generateParenthesis;

class GenerateParentheses22Test {

    @Test
    void test() {
        assertEquals(List.of("()"), generateParenthesis(1));
    }

    @Test
    void test2() {
        assertEquals(List.of("(())", "()()"), generateParenthesis(2));
    }

    @Test
    void test3() {
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), generateParenthesis(3));
    }
}