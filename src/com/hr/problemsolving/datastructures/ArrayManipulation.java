package com.hr.problemsolving.datastructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayManipulation {
    public static void main(String[] args) {
        System.out.println(arrayManipulation(5, List.of(List.of(1, 2, 100), List.of(2, 5, 100), List.of(3, 4, 100))));
        System.out.println(arrayManipulation(10, List.of(List.of(1, 5, 3), List.of(4, 8, 7), List.of(6, 9, 1))));
    }

    static long arrayManipulation(int n, List<List<Integer>> queries) {
        Map<Integer, Integer> map = new HashMap<>(n);
        int max = Integer.MIN_VALUE;

        for (List<Integer> query : queries) {
            int start = query.get(0);
            int end = query.get(1);
            int step = query.get(2);
            while (start <= end) {
                if (map.containsKey(start - 1)) {
                    map.put(start - 1, map.get(start - 1) + step);
                } else {
                    map.put(start - 1, step);
                }

                if (map.get(start - 1) > max) {
                    max = map.get(start - 1);
                }
                start++;
            }
        }

        return max;
    }

}
