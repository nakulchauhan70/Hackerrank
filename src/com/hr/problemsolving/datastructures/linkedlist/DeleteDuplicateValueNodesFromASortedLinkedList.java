package com.hr.problemsolving.datastructures.linkedlist;

public class DeleteDuplicateValueNodesFromASortedLinkedList {
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        if (llist == null || llist.next == null) {
            return llist;
        }

        SinglyLinkedListNode root = llist;

        while (llist.next != null) {
            if (llist.data == llist.next.data) {
                llist.next = llist.next.next;
            } else {
                llist = llist.next;
            }
        }

        return root;
    }
}

//head -> 1,2,2,3,3,null

//head -> 2,2,3,3,null

//head -> 1,2,3,3,null