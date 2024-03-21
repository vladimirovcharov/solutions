package org.solutions.leetcode.array;

public class FindTheHighestAltitude1732 {
    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        int highest = altitudes[0];
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
            if (highest < altitudes[i + 1]) {
                highest = altitudes[i + 1];
            }
        }
        return highest;
    }
}
