package org.solutions.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.solutions.leetcode.design.DesignParkingSystem.ParkingSystem;
import static org.solutions.leetcode.design.DesignParkingSystem.ParkingSystem2;

class DesignParkingSystemTest {

    @Test
    void testParkingSystem() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        assertTrue(parkingSystem.addCar(1));
        assertTrue(parkingSystem.addCar(2));
        assertFalse(parkingSystem.addCar(3));
        assertFalse(parkingSystem.addCar(1));
    }

    @Test
    void testParkingSystem2() {
        ParkingSystem2 parkingSystem2 = new ParkingSystem2(1, 2, 0);
        assertTrue(parkingSystem2.addCar(1));
        assertTrue(parkingSystem2.addCar(2));
        assertFalse(parkingSystem2.addCar(3));
        assertTrue(parkingSystem2.addCar(2));
        assertFalse(parkingSystem2.addCar(1));
        assertFalse(parkingSystem2.addCar(2));
    }

}