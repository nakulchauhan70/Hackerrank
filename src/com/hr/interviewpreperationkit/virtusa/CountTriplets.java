package com.hr.interviewpreperationkit.virtusa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
    public static void main(String[] args) {
        System.out.println(countTriplets(List.of(1L, 5L, 5L, 25L, 125L), 5));
    }

    static long countTriplets(List<Long> arr, long r) {
        long triplets = 0;
        if (arr.size() == 1) {
            return triplets;
        }

        Map<Long, Long> beforeMap = new HashMap<>();
        Map<Long, Long> afterMap = new HashMap<>();


        for (Long aLong : arr) {
            afterMap.merge(aLong, 1L, Long::sum);
        }

        for (Long aLong : arr) {
            afterMap.merge(aLong, -1L, Long::sum);
            if (beforeMap.containsKey(aLong / r) && aLong % r == 0 && afterMap.containsKey(aLong * r)) {
                triplets += beforeMap.get(aLong / r) * afterMap.get(aLong * r);
            }

            beforeMap.merge(aLong, 1L, Long::sum);
        }

        return triplets;
    }

}
