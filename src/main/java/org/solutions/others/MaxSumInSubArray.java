package org.solutions.others;

public class MaxSumInSubArray {
    public static int getMaxSum(int k, int... arr) {
        int start = 0;
        int maxSum = 0;
        int windowSum = 0;

        if (arr.length < k) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if ((i - start + 1) == k) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[start];
                start++;
            }

        }
        return maxSum;
    }
}
