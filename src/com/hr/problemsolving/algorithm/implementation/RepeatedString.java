package com.hr.problemsolving.algorithm.implementation;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 10));
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("a", 1000000000000L));
    }

    public static long repeatedString(String s, long n) {
        if (!s.contains("a"))
            return 0;

        //12 -> 12/5 => 2-1  + 12%5 = 2
        //15 -> 15/5 => 3-1  + 15%5 = 0
        //19 -> 19/5 => 3-1  + 19%5 = 4

        long noOfAInString = getACount(s);

        long completeNewStringToAdd = (n / s.length());
        long additionalCharsToAdd = n % s.length();

        noOfAInString *= completeNewStringToAdd;
        noOfAInString += getACount(s.substring(0, (int) additionalCharsToAdd));

        return noOfAInString;
    }

    private static long getACount(String s) {
        long noOfAInString = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a')
                noOfAInString++;
        }

        return noOfAInString;
    }
}
