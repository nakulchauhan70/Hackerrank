package com.hr.problemsolving.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static void inOrder(Node root) {
        List<Integer> arrayList = new ArrayList<>();
        inOrder(root, arrayList);
        for (Integer data : arrayList) {
            System.out.print(data + " ");
        }
    }

    private static List<Integer> inOrder(Node node, List<Integer> arrayList) {
        if (node != null) {
            inOrder(node.left, arrayList);
            arrayList.add(node.data);
            inOrder(node.right, arrayList);
        }

        return arrayList;
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

//InOrder traversal - 1 2 3 4 5 6