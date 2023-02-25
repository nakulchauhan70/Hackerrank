package com.hr.problemsolving.datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
//        dynamicArray(2, List.of(List.of(1, 0, 5), List.of(1, 1, 7), List.of(1, 0, 3), List.of(2, 1, 0), List.of(2, 1, 1))).forEach(System.out::println);
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<ArrayList<Integer>> sequences = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequences.add(new ArrayList<>());
        }
        List<Integer> result = new ArrayList<>();

        int lastAnswer = 0;

        for (List<Integer> query : queries) {
            ArrayList<Integer> seq = sequences.get((query.get(1) ^ lastAnswer) % n);
            if (query.get(0) == 1) {
                seq.add(query.get(2));
            } else {
                lastAnswer = seq.get(query.get(2) % seq.size());
                result.add(lastAnswer);
            }
        }

        return result;
    }
}
