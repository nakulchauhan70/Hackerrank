package com.hr.problemsolving.datastructures.linkedlist;

public class DeleteANode {
    //20,6,2,19,10
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0){
            head = head.next;
            return head;
        }

        SinglyLinkedListNode node = head;
        SinglyLinkedListNode prevNode = null;
        int count = 0;
        while (node != null) {
            if (count == position && prevNode != null) {
                prevNode.next = node.next;
            }
            prevNode = node;
            node = node.next;
            count++;
        }
        return head;
    }

}
