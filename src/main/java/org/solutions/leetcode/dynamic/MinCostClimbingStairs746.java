package org.solutions.leetcode.dynamic;

public class MinCostClimbingStairs746 {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] arr = new int[n + 1];
        arr[0] = cost[0];
        arr[1] = cost[1];

        for (int i = 2; i < n; i++) {
            arr[i] = cost[i] + Math.min(arr[i - 2], arr[i - 1]);
        }

        return Math.min(arr[n - 2], arr[n - 1]);
    }
}
