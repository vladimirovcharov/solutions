package org.solutions.leetcode.array;

import java.util.Arrays;

public class SingleNumber136 {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i++;
            }
        }
        return -1;
    }

    public static int singleNumber2(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
