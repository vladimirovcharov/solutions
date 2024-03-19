package org.solutions.leetcode.array;

public class MaximumAverageSubarrayI643 {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = -Double.MAX_VALUE;
        double windowSum = 0.0;

        for (int i = 0, start = 0; i < nums.length; i++) {
            windowSum += nums[i];
            if ((i - start + 1) == k) {
                maxAverage = Math.max(maxAverage, windowSum / k);
                windowSum -= nums[start];
                start++;
            }
        }

        return maxAverage;
    }
}
