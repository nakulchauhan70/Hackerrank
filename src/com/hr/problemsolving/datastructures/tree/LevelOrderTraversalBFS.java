package com.hr.problemsolving.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversalBFS {
    public static void levelOrder(Node root) {
        List<Integer> arrayList = new ArrayList<>();
        levelOrder(root, arrayList);
        for (Integer data : arrayList) {
            System.out.print(data + " ");
        }
    }

    private static void levelOrder(Node root, List<Integer> arrayList) {
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            currentLevel(root, i, arrayList);
        }
    }

    private static void currentLevel(Node root, int level, List<Integer> arrayList) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            arrayList.add(root.data);
        } else if (level > 1) {
            currentLevel(root.left, level - 1, arrayList);
            currentLevel(root.right, level - 1, arrayList);
        }
    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight) {
                return lheight + 1;
            } else {
                return rheight + 1;
            }
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
//            \
//             4

//Level order traversal - 1 2 5 3 6 4