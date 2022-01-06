package com.hr.problemsolving.datastructures.linkedlist;

public class GetNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        if (llist == null) {
            return 0;
        }

        int counter = -1;
        int positionFromHead = llist.data - positionFromTail;

        while (llist.next != null) {
            counter++;
            if (counter == positionFromHead) {
                return llist.data;
            }
        }

        return 0;
    }
}
