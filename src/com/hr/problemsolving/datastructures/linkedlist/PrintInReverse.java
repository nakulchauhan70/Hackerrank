package com.hr.problemsolving.datastructures.linkedlist;

public class PrintInReverse {
//    static void reversePrint(SinglyLinkedListNode head) {
//        if (head == null)
//            return;
//
//        reversePrint(head.next);
//
//        System.out.println(head.data + " ");
//    }

    //1->2->3->4
    //4->3->2->1
    static SinglyLinkedListNode reversePrint(SinglyLinkedListNode head) {
        if (head == null || head.next == null)
            return head;

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode next = null;

        while (curr != null) {
            next = curr.next;//2->3->4, 3->4, 4, null
            curr.next = prev;//1->null, 2->1->null, 3->2->1->null, 4->3->2->1->null
            prev = curr;//1->null, 2->1->null, 3->2->1->null, 4->3->2->1->null
            curr = next;//2->3->4, 3->4, 4, null
        }

        return prev;
    }
}
