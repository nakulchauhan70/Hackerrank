package com.hr.problemsolving.datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// O(n) time | O(n) space
public class LevelOrderTraversalBFSUsingQueue {
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        List<Integer> arrayList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            arrayList.add(node.data);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        for (Integer data : arrayList) {
            System.out.print(data + " ");
        }
    }
}
