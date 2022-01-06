package com.hr.problemsolving.datastructures.tree;

//O(n) time | O(1) space
public class LowestCommonAncestor {
    public static Node lca(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }

        if (root.data == v1 || root.data == v2) {
            return root;
        }

        Node lNode = lca(root.left, v1, v2);
        Node rNode = lca(root.right, v1, v2);

        if (lNode != null && rNode != null) {
            return root;
        } else if (lNode != null) {
            return lNode;
        } else {
            return rNode;
        }
    }
}

//Logic

//     1
//      \
//       2
//        \
//         5
//       /  \
//      3    6
//       \
//        4

//Given nodes : 4, 6 LCA : 5