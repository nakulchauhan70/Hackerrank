package com.hr._1weekpreperationkit.day_2;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
//        System.out.println(diagonalDifference(List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12))));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            diagonal1 += arr.get(i).get(i);
            diagonal2 += arr.get(i).get((arr.size() - 1) - i);
        }

        return Math.abs(diagonal1 - diagonal2);
    }

}
