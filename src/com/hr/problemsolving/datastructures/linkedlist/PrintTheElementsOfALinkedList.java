package com.hr.problemsolving.datastructures.linkedlist;

public class PrintTheElementsOfALinkedList {
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}

