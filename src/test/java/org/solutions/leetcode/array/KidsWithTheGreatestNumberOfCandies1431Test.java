package org.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KidsWithTheGreatestNumberOfCandies1431Test {

    @Test
    void test() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies1431.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertArrayEquals(new List[]{expected}, new List[]{actual});
    }

    @Test
    void test2() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies1431.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = List.of(true, false, true);
        assertArrayEquals(new List[]{expected}, new List[]{actual});
    }

    @Test
    void test3() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies1431.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertArrayEquals(new List[]{expected}, new List[]{actual});
    }

}