package org.solutions.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeLinkedList234Test {

    @Test
    void testTrue() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        assertTrue(PalindromeLinkedList234.isPalindrome(node));
    }

    @Test
    void testFalse() {
        ListNode node = new ListNode(1, new ListNode(2));
        assertFalse(PalindromeLinkedList234.isPalindrome(node));
    }
}