package com.hr.problemsolving.algorithm.implementation;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(124));
    }
//124
    public static int findDigits(int n) {
        int dividend = n;
        int digitCount = 0;
        do {
            int remainder = dividend % 10;
            dividend = dividend / 10;
            if (remainder != 0 && n % remainder == 0) {
                digitCount++;
            }
        }
        while (dividend != 0);

        return digitCount;
    }
}
