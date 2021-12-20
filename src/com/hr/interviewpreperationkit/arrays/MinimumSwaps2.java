package com.hr.interviewpreperationkit.arrays;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
    }

    static int minimumSwaps(int[] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            while (i + 1 != arr[i]) {
                int swapIndex = arr[i] - 1;
                int valueAtIndex = arr[i];
                int valueAtSwapIndex = arr[swapIndex];

                arr[i] = valueAtSwapIndex;
                arr[swapIndex] = valueAtIndex;

                swap++;
            }
        }

        return swap;

    }
}
