package org.solutions.leetcode.linkedlist;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversedL1 = reverseList(l1);
        ListNode reversedL2 = reverseList(l2);
        String str1 = getStringValue(reversedL1);
        String str2 = getStringValue(reversedL2);
        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);
        BigInteger sum = num1.add(num2);
        return reverseList(buildListNode(sum));
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    private static String getStringValue(ListNode listNode) {
        ListNode current = listNode;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.val);
            current = current.next;
        }
        return result.toString();
    }

    private static ListNode buildListNode(BigInteger num) {
        String str = num.toString();
        ListNode result = new ListNode(Character.getNumericValue(str.charAt(0)));
        if (str.length() == 1) {
            return result;
        }
        ListNode current = result;
        for (int i = 1; i < str.length(); i++) {
            current.next = new ListNode(Character.getNumericValue(str.charAt(i)));
            current = current.next;
        }
        return result;
    }
}
