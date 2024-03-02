package org.solutions.leetcode.design;

public class DesignParkingSystem {
    static class ParkingSystem2 {
        int[] arr;

        public ParkingSystem2(int big, int medium, int small) {
            arr = new int[]{big, medium, small};
        }

        public boolean addCar(int carType) {
            if (arr[carType - 1] > 0) {
                arr[carType - 1]--;
                return true;
            }
            return false;
        }
    }

    static class ParkingSystem {
        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1 -> {
                    if (big - 1 >= 0) {
                        big--;
                        return true;
                    } else {
                        return false;
                    }
                }
                case 2 -> {
                    if (medium - 1 >= 0) {
                        medium--;
                        return true;
                    } else {
                        return false;
                    }
                }
                case 3 -> {
                    if (small - 1 >= 0) {
                        small--;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }
    }
}
