package com.hr.problemsolving.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static void main(String[] args) {

    }

    public static void preOrder(Node root) {
        List<Integer> arrayList = new ArrayList<>();
        preOrder(root, arrayList);
        for (Integer data : arrayList) {
            System.out.print(data + " ");
        }
    }

    private static List<Integer> preOrder(Node node, List<Integer> arrayList) {
        if (node != null) {
            arrayList.add(node.data);
            preOrder(node.left, arrayList);
            preOrder(node.right, arrayList);
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

//PreOrder traversal - 1 2 5 3 4 6