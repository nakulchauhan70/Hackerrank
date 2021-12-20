package com.hr.interviewpreperationkit.arrays;

import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        minimumBribes(List.of(2, 1, 5, 3, 4));
    }

    public static void minimumBribes(List<Integer> q) {
        int p1 = 1;
        int p2 = 2;
        int p3 = 3;

        int bribeCount = 0;
        System.out.println(p1 + " " + p2 + " " + p3);

        for (Integer item : q) {
            if (p1 == item) {
                p1 = p2;
                p2 = p3;
                p3++;
            } else if (p2 == item) {
                bribeCount++;
                p2 = p3;
                p3++;
            } else if (p3 == item) {
                bribeCount += 2;
                p3++;
            } else {
                System.out.println("Too chaotic");
                return;
            }

            System.out.println(p1 + " " + p2 + " " + p3);
        }

        System.out.println(bribeCount);
    }

}
