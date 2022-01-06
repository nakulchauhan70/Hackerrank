package com.hr.problemsolving.datastructures.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopView {
    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        Queue<NodeWithDistance> queue = new LinkedList<>();
        queue.add(new NodeWithDistance(root, 0));

        while (!queue.isEmpty()) {
            NodeWithDistance nodeWithDistance = queue.poll();

            if (!map.containsKey(nodeWithDistance.dist)) {
                map.put(nodeWithDistance.dist, nodeWithDistance.node.data);
            }
            if (nodeWithDistance.node.left != null) {
                int dist = nodeWithDistance.dist - 1;
                queue.add(new NodeWithDistance(nodeWithDistance.node.left, dist));
            }
            if (nodeWithDistance.node.right != null) {
                int dist = nodeWithDistance.dist + 1;
                queue.add(new NodeWithDistance(nodeWithDistance.node.right, dist));
            }
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getValue).forEach(v -> System.out.print(v + " "));
    }

    public static void bottomView(Node root) {
        if (root == null) {
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        Queue<NodeWithDistance> queue = new LinkedList<>();
        queue.add(new NodeWithDistance(root, 0));

        while (!queue.isEmpty()) {
            NodeWithDistance nodeWithDistance = queue.poll();

            map.put(nodeWithDistance.dist, nodeWithDistance.node.data);
            if (nodeWithDistance.node.left != null) {
                int dist = nodeWithDistance.dist - 1;
                queue.add(new NodeWithDistance(nodeWithDistance.node.left, dist));
            }
            if (nodeWithDistance.node.right != null) {
                int dist = nodeWithDistance.dist + 1;
                queue.add(new NodeWithDistance(nodeWithDistance.node.right, dist));
            }
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getValue).forEach(v -> System.out.print(v + " "));
    }

}

class NodeWithDistance {
    Node node;
    int dist;

    public NodeWithDistance(Node node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

//Logic

//             1
//            /  \
//           10   2
//          / \    \
//         8   9    5
//                 / \
//                3   6
//                     \
//                      4

//Top view     - 8 10 1 2 3 6 4
//Bottom view  - 8 10 9 3 5 6 4