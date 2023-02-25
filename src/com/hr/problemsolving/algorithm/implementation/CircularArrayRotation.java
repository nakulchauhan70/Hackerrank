package com.hr.problemsolving.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
//        System.out.println(circularArrayRotation(List.of(3, 4, 5), 2, List.of(1, 2)));
//        System.out.println(circularArrayRotation(List.of(3, 4, 5), 2, List.of(1, 2)));

    }
//
//    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
//        List<Integer> rotatedArray = new ArrayList<>();
//        for (Integer query : queries) {
//            if (query - k >= 0) {
//                rotatedArray.add(a.get(query - k));
//            } else {
//                rotatedArray.add(a.get(query - k + a.size()));
//            }
//        }
//
//        return rotatedArray;
//    }


    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> list = new ArrayList<>();

        int[] rotatedArray = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            rotatedArray[(i + k) % a.size()] = a.get(i); // clockwise
            // encryptedArr[i] = alphabets.charAt((alphabets.charAt(i) - 'a' + k) % alphabets.length());    // anti-clockwise
        }

        for (Integer query : queries) {
            list.add(rotatedArray[query]);
        }

        return list;
    }
}