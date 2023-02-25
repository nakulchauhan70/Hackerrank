package com.hr.problemsolving.algorithm.implementation;

import java.util.List;

public class UtopianTree {
    public static void main(String[] args) {
//        List.of(0, 1, 4).forEach(n -> System.out.println(utopianTree(n)));
    }

    public static int utopianTree(int n) {
        int height = 1;

        if (n == 0)
            return height;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                height *= 2;
            else
                height++;
        }

        return height;
    }

}
