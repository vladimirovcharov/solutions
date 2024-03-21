package org.solutions.leetcode.others;

public class GuessNumberHigherOrLower374 extends GuessGame {
    public GuessNumberHigherOrLower374(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.printf("Is it %d ?%n", mid);
            int num = guess(mid);

            if (num == 0) {
                return mid;
            } else if (num == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

class GuessGame {
    public int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {
        return Integer.compare(pick, num);
    }
}
