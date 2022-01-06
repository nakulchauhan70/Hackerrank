package com.hr.problemsolving.datastructures.tree;

public class Insertion {
    public static Node insert(Node root, int data) {
        if (root == null) {
            Node node = new Node();
            node.data = data;

            return node;
        }

        if (data == root.data) {
            return root;
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }

        return root;
    }
}
