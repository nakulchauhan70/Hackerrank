package com.hr.problemsolving.datastructures.tree;

public class HeightOfBinaryTree {
    public static int height(Node root) {
        if (root == null) {
            return -1;
        }

        int maxLeftHeight = height(root.left);
        int maxRightHeight = height(root.right);

        if (maxLeftHeight > maxRightHeight) {
            return maxLeftHeight + 1;
        } else {
            return maxRightHeight + 1;
        }
    }
}

//Logic
//
//        1
//      /    \
//     2      3
//    / \
//   4   5
//
//
//    maxDepth('1') = max(maxDepth('2'), maxDepth('3')) + 1
//                                = 1 + 1
//                                  /    \
//                                /         \
//                              /             \
//                            /                 \
//                          /                     \
//                maxDepth('2') = 1              maxDepth('3') = 0
//        = max(maxDepth('4'), maxDepth('5')) + 1
//        = 1 + 0   = 1
//                    /    \
//                  /        \
//                /            \
//              /                \
//            /                    \
//        maxDepth('4') = 0     maxDepth('5') = 0