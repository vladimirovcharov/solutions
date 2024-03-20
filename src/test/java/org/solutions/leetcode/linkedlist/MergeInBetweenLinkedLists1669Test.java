package org.solutions.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeInBetweenLinkedLists1669Test {

    @Test
    void test() {
        ListNode list1 = new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6,
                new ListNode(9, new ListNode(5))))));
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));
        int a = 3, b = 4;
        ListNode actual = MergeInBetweenLinkedLists1669.mergeInBetween(list1, a, b, list2);
        ListNode expected = new ListNode(10, new ListNode(1, new ListNode(13,
                new ListNode(1000000, new ListNode(1000001, new ListNode(1000002, new ListNode(5)))))));
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
        assertEquals(expected.next.next.next.next.next.val, actual.next.next.next.next.next.val);
        assertEquals(expected.next.next.next.next.next.next.val, actual.next.next.next.next.next.next.val);
        assertNull(actual.next.next.next.next.next.next.next);
    }

    @Test
    void test2() {
        ListNode list1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002,
                new ListNode(1000003, new ListNode(1000004)))));
        int a = 2, b = 5;
        ListNode actual = MergeInBetweenLinkedLists1669.mergeInBetween(list1, a, b, list2);
        ListNode expected = new ListNode(0, new ListNode(1, new ListNode(1000000,
                new ListNode(1000001, new ListNode(1000002, new ListNode(1000003,
                        new ListNode(1000004, new ListNode(6))))))));
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