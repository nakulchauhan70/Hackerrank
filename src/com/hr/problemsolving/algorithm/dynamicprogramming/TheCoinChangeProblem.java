package com.hr.problemsolving.algorithm.dynamicprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheCoinChangeProblem {
    public static void main(String[] args) {
        System.out.println(getWays(3, Arrays.asList(8L, 3L, 1L, 2L)));
    }

    public static long getWays(int n, List<Long> c) {
        Collections.sort(c);
        int[][] dp = new int[c.size()][Integer.parseInt(String.valueOf(c.get(c.size()-1)))];
        Arrays.fill(dp[0], 1);


        for (int i = 1; i < c.size(); i++) {
            for (int j = 0; j < n; j++) {
                if (c.get(i) > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][(int) (c.get(i) - j)];
                }
            }
        }

        return dp[n - 1][c.size() - 1];
    }
}
