package org.solutions.leetcode.others;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, n, "", result);
        return result;
    }

    private static void generateParenthesisHelper(int open, int close, String current, List<String> result) {
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }
        if (open > 0) {
            generateParenthesisHelper(open - 1, close, current + "(", result);
        }
        if (close > open) {
            generateParenthesisHelper(open, close - 1, current + ")", result);
        }
    }

}
