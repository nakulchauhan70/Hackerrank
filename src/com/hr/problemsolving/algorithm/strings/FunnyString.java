package com.hr.problemsolving.algorithm.strings;

public class FunnyString {
    public static void main(String[] args) {
        System.out.println(funnyString("bcxz"));
    }

    public static String funnyString(String s) {
        String funny = "Funny";
        String notFunny = "Not Funny";
        if (s.length() == 0) {
            return notFunny;
        }

        if (s.length() == 1) {
            return funny;
        }

        int start = 0;
        int end = s.length() - 1;


        while (start < s.length() - 1 && end > 0) {
            if (Math.abs((int) s.charAt(start) - (int) s.charAt(start + 1)) != Math.abs((int) s.charAt(end) - (int) s.charAt(end - 1))) {
                return notFunny;
            }
            start++;
            end--;
        }

        return funny;
    }
}
