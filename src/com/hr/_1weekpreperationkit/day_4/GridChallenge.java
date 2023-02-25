package com.hr._1weekpreperationkit.day_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GridChallenge {
    public static void main(String[] args) {
        System.out.println(gridChallenge(List.of("abc", "hjk", "mpq", "rtv")));
    }

    //abc
    //hjk
    //mpq
    //rtv
    public static String gridChallenge(List<String> grid) {
        if (grid.size() == 1) {
            return "YES";
        }

        grid = grid.stream().map(s -> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }).collect(Collectors.toList());

        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 0; j < grid.size() - 1; j++) {
                if (grid.get(j).charAt(i) > grid.get(j + 1).charAt(i)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

}
