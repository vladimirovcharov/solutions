package org.leetcode.solutions.array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate2(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        HashSet<Integer> hs = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!hs.add(num)) {
                return true;
            }
        }
        return false;
    }
}
