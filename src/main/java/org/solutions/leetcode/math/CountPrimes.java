package org.solutions.leetcode.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return (int) IntStream.range(2, n).filter(i -> isPrime[i]).count();
    }
}
