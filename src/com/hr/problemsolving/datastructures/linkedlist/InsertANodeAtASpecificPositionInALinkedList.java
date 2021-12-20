package com.hr.problemsolving.datastructures.linkedlist;

public class InsertANodeAtASpecificPositionInALinkedList {
    public static void main(String[] args) {

    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null)
            return newNode;

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedListNode node = head;
        int currentPosition = 0;
        while (node != null) {
            currentPosition++;
            if (currentPosition == position) {
                newNode.next = node.next;
                node.next = newNode;
            }
            node = node.next;
        }
        return head;
    }
}
