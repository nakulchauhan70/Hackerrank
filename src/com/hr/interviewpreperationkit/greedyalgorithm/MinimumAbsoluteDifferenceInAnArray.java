package com.hr.interviewpreperationkit.greedyalgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {
    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(Arrays.asList(3, -7, 0)));
        System.out.println(minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75)));
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        if (arr.size() == 1) {
            return arr.get(0);
        }

        Collections.sort(arr);

        int minDif = Math.abs(arr.get(1) - arr.get(0));

        int firstIndex = 1;
        int secondIndex = 2;
        int tempMinDiff;
        while (secondIndex < arr.size()) {
            tempMinDiff = Math.abs(arr.get(firstIndex) - arr.get(secondIndex));
            if (tempMinDiff < minDif) {
                minDif = tempMinDiff;
            }

            firstIndex++;
            secondIndex++;
        }

        return minDif;
    }
}
