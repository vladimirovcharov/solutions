package org.solutions.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            list.add(candy + extraCandies >= max ? Boolean.TRUE : Boolean.FALSE);
        }
        return list;
    }
}
