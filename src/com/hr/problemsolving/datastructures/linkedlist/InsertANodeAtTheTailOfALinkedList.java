package com.hr.problemsolving.datastructures.linkedlist;

public class InsertANodeAtTheTailOfALinkedList {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode tailNode = new SinglyLinkedListNode();
        tailNode.data = data;

        if (head == null) {
            head = tailNode;
            return head;
        }
        SinglyLinkedListNode lastNodeInList = head;
        while (lastNodeInList.next != null) {
            lastNodeInList = lastNodeInList.next;
        }

        lastNodeInList.next = tailNode;

        return head;
    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
}
