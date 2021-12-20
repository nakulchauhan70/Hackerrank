package com.hr.problemsolving.algorithm.implementation;

import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 2, 1, 3, 2), 3, 2));
//        System.out.println(birthday(List.of(4), 4, 1));

    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            int j = i;
            while (j <= (i + m - 1)) {
                sum += s.get(j);
                j++;
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }
}
