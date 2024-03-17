package org.solutions.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbers2Test {

    @Test
    void addTwoNumbers() {
        /*
        * Input: l1 = [2,4,3], l2 = [5,6,4]
        * Output: [7,0,8]
        * Explanation: 342 + 465 = 807.
        *
        * */
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode actual = AddTwoNumbers2.addTwoNumbers(l1, l2);
        assertNotNull(actual);

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

    @Test
    void addTwoNumbers2() {
        /*
        * Input: l1 = [0], l2 = [0]
        * Output: [0]
        * */
        ListNode l1 = new ListNode(0, new ListNode(0, null));
        ListNode l2 = new ListNode(0, null);

        ListNode actual = AddTwoNumbers2.addTwoNumbers(l1, l2);
        assertNotNull(actual);

        ListNode expected = new ListNode(0);
        assertEquals(expected.val, actual.val);
        assertNull(actual.next);
    }

    @Test
    void addTwoNumbers3() {
        /*
        * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        * Output: [8,9,9,9,0,0,0,1]
        * */
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode actual = AddTwoNumbers2.addTwoNumbers(l1, l2);
        assertNotNull(actual);

        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
        assertEquals(expected.next.next.next.next.next.val, actual.next.next.next.next.next.val);
        assertEquals(expected.next.next.next.next.next.next.val, actual.next.next.next.next.next.next.val);
        assertEquals(expected.next.next.next.next.next.next.next.val, actual.next.next.next.next.next.next.next.val);
        assertNull(actual.next.next.next.next.next.next.next.next);
    }
}