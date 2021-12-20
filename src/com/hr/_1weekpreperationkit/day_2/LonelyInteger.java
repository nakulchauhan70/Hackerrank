package com.hr._1weekpreperationkit.day_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyInteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
    }

    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : a) {
            map.merge(integer, 1, Integer::sum);
        }

        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).mapToInt(Map.Entry::getKey).findFirst().orElse(-1);
    }
}
