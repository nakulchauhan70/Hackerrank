package com.hr.problemsolving.datastructures.linkedlist;


public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {
        SinglyLinkedListNode linkedList = new SinglyLinkedListNode(1);
        linkedList.next = new SinglyLinkedListNode(3);
        linkedList.next.next = new SinglyLinkedListNode(7);

        SinglyLinkedListNode linkedList1 = new SinglyLinkedListNode(1);
        linkedList1.next = new SinglyLinkedListNode(2);
        mergeLists(linkedList, linkedList1);
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        SinglyLinkedListNode dummyNode = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = dummyNode;

        while (true) {
            if (head1 == null) {
                tail.next = head2;
                break;
            }

            if (head2 == null) {
                tail.next = head1;
                break;
            }

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        return dummyNode.next;
    }
}


