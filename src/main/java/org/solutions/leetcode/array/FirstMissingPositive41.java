package org.solutions.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive41 {
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1;
    }

    public static int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0 || nums[i] > n) {
                nums[i] = 0;
            } else {
                visited[nums[i]] = true;
            }
        }
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return visited.length;
    }
}
