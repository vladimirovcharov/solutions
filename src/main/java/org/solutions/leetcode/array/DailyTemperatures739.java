package org.solutions.leetcode.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currTemp = temperatures[i];
            while (!deque.isEmpty() && currTemp > temperatures[deque.peek()]) {
                int idx = deque.pop();
                result[idx] = i - idx;
            }
            deque.push(i);
        }

        return result;
    }

    public static int[] dailyTemperatures2(int[] temperatures) {
        int n = temperatures.length;
        int highest = temperatures[n - 1];
        int[] ans = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int temp = temperatures[i];
            if (temp >= highest) {
                highest = temp;
            } else {
                int j = i + 1;
                while (temperatures[j] <= temp) {
                    j = ans[j] + j;
                }
                ans[i] = j - i;
            }
        }
        return ans;
    }
}
