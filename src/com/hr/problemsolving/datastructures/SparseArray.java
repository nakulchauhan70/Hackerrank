package com.hr.problemsolving.datastructures;

import com.hr.Reader;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class SparseArray {
    public static void main(String[] args) {
        Reader.FastReader fr = new Reader.FastReader();
        int strArrNo = fr.nextInt();
        String[] strArr = new String[strArrNo];

        for (int i = 0; i < strArrNo; i++) {
            strArr[i] = fr.next();
        }

        int queryArrNo = fr.nextInt();
        String[] queryArr = new String[queryArrNo];

        for (int i = 0; i < queryArrNo; i++) {
            queryArr[i] = fr.next();
        }
        int[] matchingStringCounts = matchingStrings(strArr, queryArr);
        for (int matchingStringCount : matchingStringCounts) {
            System.out.println(matchingStringCount);
        }
    }

    static int[] matchingStrings(String[] strArr, String[] queryArr) {
        AtomicInteger i = new AtomicInteger(0);
        int[] matchingStringCounts = new int[queryArr.length];
        Stream.of(queryArr).forEach(query -> {
            matchingStringCounts[i.getAndIncrement()] = (int) Stream.of(strArr).filter(str -> str.equalsIgnoreCase(query)).count();
        });

        return matchingStringCounts;
    }
}
