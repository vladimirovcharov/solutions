package org.solutions.leetcode.array;

import java.util.*;

public class UniqueNumberOfOccurrences1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] nums = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            nums[index++] = count;

        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            while (nums[i] == 0) i++;
            if (nums[i] == nums[i - 1]) return false;
        }
        return true;
    }

    public static boolean uniqueOccurrences2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (!set.add(value)) {
                return false;
            }
        }

        return true;
    }
}
