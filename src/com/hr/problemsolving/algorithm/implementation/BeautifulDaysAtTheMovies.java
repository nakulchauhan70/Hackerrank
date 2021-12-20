package com.hr.problemsolving.algorithm.implementation;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;

        for (int l = i; l <= j; l++) {
            if (Math.abs(l - reveseNo(l)) % k == 0)
                beautifulDays++;
        }

        return beautifulDays;
    }

    private static int reveseNo(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return reversed;
    }
}
