package com.hr.problemsolving.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class PostTraversal {
    public static void postOrder(Node root) {
        List<Integer> arrayList = new ArrayList<>();
        postOrder(root, arrayList);
        for (Integer data : arrayList) {
            System.out.print(data + " ");
        }
    }

    private static List<Integer> postOrder(Node node, List<Integer> arrayList) {
        if (node != null) {
            postOrder(node.left, arrayList);
            postOrder(node.right, arrayList);
            arrayList.add(node.data);
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
//       \
//        4

//PostOrder traversal - 4 3 6 5 2 1