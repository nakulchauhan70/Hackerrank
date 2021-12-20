package com.hr._1weekpreperationkit.day_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
    }

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
//        Collections.sort(arr);

        System.out.print(arr.stream().limit(4).mapToLong(i -> i).sum() + " " + arr.stream().skip(1).mapToLong(i -> i).sum());
    }
}
