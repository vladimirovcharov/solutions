package org.solutions.leetcode.linkedlist;

public class MergeInBetweenLinkedLists1669 {
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode beforeA = list1;
        for (int i = 0; i < a - 1; i++) {
            beforeA = beforeA.next;
        }
        
        ListNode afterB = beforeA;
        for (int i = 0; i < b - a + 2; i++) {
            afterB = afterB.next;
        }

        beforeA.next = list2;

        ListNode endOfList2 = list2;
        while (endOfList2.next != null) {
            endOfList2 = endOfList2.next;
        }

        endOfList2.next = afterB;

        return list1;
    }
}
