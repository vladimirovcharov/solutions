package org.solutions.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedList206Test {

    @Test
    void test() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5)))));

        ListNode actual = ReverseLinkedList206.reverseList(list);

        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2,
                new ListNode(1)))));

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
        assertNull(actual.next.next.next.next.next);
    }

    @Test
    void test2() {
        ListNode list = new ListNode(1, new ListNode(2));

        ListNode actual = ReverseLinkedList206.reverseList(list);

        ListNode expected = new ListNode(2, new ListNode(1));

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertNull(actual.next.next);
    }
}