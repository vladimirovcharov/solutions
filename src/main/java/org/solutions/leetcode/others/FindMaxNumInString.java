package org.solutions.leetcode.others;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Arrays.stream;

public class FindMaxNumInString {
    static int findMaxInGroup(String str) {
        return stream(str.replaceAll("\\D", " ").split(" "))
                .filter(i -> !i.isEmpty())
                .map(Integer::parseInt)
                .max(Comparator.comparing(Integer::intValue))
                .orElseThrow(NoSuchElementException::new);
    }

    static int findMaxInGroup2(String str) {
        List<Integer> nums = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                s.append(c);
            } else {
                if (!s.isEmpty()) {
                    nums.add(Integer.valueOf(s.toString()));
                    s = new StringBuilder();
                }
            }
        }

        return nums.stream().max(Comparator.comparing(Integer::intValue)).orElseThrow(NoSuchElementException::new);
    }
}
