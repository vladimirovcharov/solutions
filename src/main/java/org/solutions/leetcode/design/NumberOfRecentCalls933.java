package org.solutions.leetcode.design;

public class NumberOfRecentCalls933 {

    static class RecentCounter {
        private final int[] requests = new int[10000];
        private int start;
        private int end;

        public RecentCounter() {
            start = 0;
            end = 0;
        }

        public int ping(int t) {
            while (start < end && (t - requests[start] > 3000)) {
                start++;
            }
            requests[end++] = t;
            return end - start;
        }
    }
}

