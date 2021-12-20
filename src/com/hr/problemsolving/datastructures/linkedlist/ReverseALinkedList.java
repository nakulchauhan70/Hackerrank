package com.hr.problemsolving.datastructures.linkedlist;

import java.util.Stack;

public class ReverseALinkedList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode node = head;
        while (node != null) {
            stack.push(node.data);
            node = node.next;
        }

        node = head;

        while (node != null) {
            node.data = stack.pop();
            node = node.next;
        }

        return head;
    }
}
