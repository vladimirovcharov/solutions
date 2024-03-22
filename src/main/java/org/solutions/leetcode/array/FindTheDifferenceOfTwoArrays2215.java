package org.solutions.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for (int i : nums1) {
            if (!set2.contains(i)) {
                result.get(0).add(i);
                set2.add(i);
            }
        }

        for (int i : nums2) {
            if (!set1.contains(i)) {
                result.get(1).add(i);
                set1.add(i);
            }
        }

        return result;
    }
}
