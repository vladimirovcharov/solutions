package org.solutions.leetcode.array;

public class JumpGame55 {
    public static void main(String[] args) {



    }

    public static boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        int maxReachedIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachedIndex) {
                return false;
            }
            maxReachedIndex = Math.max(maxReachedIndex, nums[i] + i);
        }

        return maxReachedIndex >= lastIndex;
    }
}
