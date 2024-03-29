package com.hr.problemsolving.datastructures.linkedlist;

public class CompareTwoLinkedLists {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1 == null && temp2 == null;
    }
}
