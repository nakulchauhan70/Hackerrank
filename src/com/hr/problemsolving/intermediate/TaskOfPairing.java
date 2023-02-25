package com.hr.problemsolving.intermediate;

import java.util.ArrayList;
import java.util.List;

public class TaskOfPairing {
    public static void main(String[] args) {
//        System.out.println(taskOfPairing(List.of(3L, 5L, 4L, 3L)));
//        System.out.println(taskOfPairing(List.of(5L, 6L, 2L)));
//        System.out.println(taskOfPairing(List.of(6L, 5L, 3L)));
    }


    public static long taskOfPairing(List<Long> freq) {
        long pair = 0;
        List<Long> list = new ArrayList<>();
        long w = 1;
        for (Long weight : freq) {
            for (int i = 0; i < weight; i++) {
                list.add(w);
            }
            w++;
        }

        int first = 0;
        int second = 1;

        for (Long weight : freq) {
            for (int i = 0; i < weight; i++) {
                list.add(w);
            }
            w++;
        }

        while (first < list.size() && second <= list.size() - 1) {
            if (Math.abs(list.get(first) - list.get(second)) <= 1) {
                pair++;
            }

            first = second + 1;
            second = first + 1;
        }

        return pair;
    }
}
