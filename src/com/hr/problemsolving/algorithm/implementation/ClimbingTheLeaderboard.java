package com.hr.problemsolving.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
//        climbingLeaderboard(List.of(100, 90, 90, 80), List.of(70, 80, 105)).forEach(System.out::println);
        climbingLeaderboard(List.of(100, 90, 90, 80, 75, 60), List.of(50, 65, 77, 90, 102)).forEach(System.out::println);
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> finalRanks = new ArrayList<>();

        int index = ranked.size() - 1;

        for (Integer score : player) {
            while (index >= 0) {
                if (ranked.get(index) > score) {
                    finalRanks.add(index + 2);
                    break;
                }
                index--;
            }

            if (index < 0) {
                finalRanks.add(1);
            }
        }
        return finalRanks;
    }
}
