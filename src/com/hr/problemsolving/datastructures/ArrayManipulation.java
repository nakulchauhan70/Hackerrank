package com.hr.problemsolving.datastructures;

import com.hr.Reader;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        Reader.FastReader fr = new Reader.FastReader();
        int arrLength = fr.nextInt();
        int noOfOperation = fr.nextInt();
        int[][] queries = new int[noOfOperation][3];
        for (int i = 0; i < noOfOperation; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = fr.nextInt();
            }
        }

        System.out.println(arrayManipulation(arrLength, queries));
    }

    static long arrayManipulation(int n, int[][] queries) {
        long maxValue = 0, temp;
        int[] valueArr = new int[n];
        for (int[] query : queries) {
            for (int j = query[0] - 1; j <= query[1] - 1; j++) {
                valueArr[j] += query[2];
            }
            temp = Arrays.stream(valueArr).summaryStatistics().getMax();
            if (temp > maxValue)
                maxValue = temp;
        }

        return maxValue;
    }

}
