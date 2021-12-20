package com.hr.problemsolving.datastructures.linkedlist;

public class InsertANodeAtTheHeadOfALinkedList {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = llist;

        return newHead;
    }
}
