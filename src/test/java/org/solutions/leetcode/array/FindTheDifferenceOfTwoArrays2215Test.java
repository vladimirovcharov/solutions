package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDifferenceOfTwoArrays2215Test {

    @Test
    void test() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> expected = List.of(List.of(1, 3), List.of(4, 6));
        List<List<Integer>> actual = FindTheDifferenceOfTwoArrays2215.findDifference(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        List<List<Integer>> expected = List.of(List.of(3), Collections.emptyList());
        List<List<Integer>> actual = FindTheDifferenceOfTwoArrays2215.findDifference(nums1, nums2);
        assertEquals(expected, actual);
    }
}