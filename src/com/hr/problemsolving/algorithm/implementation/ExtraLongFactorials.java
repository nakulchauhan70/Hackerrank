package com.hr.problemsolving.algorithm.implementation;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorials(25);
    }

    public static void extraLongFactorials(int n) {
        System.out.println(getFactorial(BigInteger.valueOf(n)));
    }

    private static BigInteger getFactorial(BigInteger n) {
        if (BigInteger.ZERO.compareTo(n) == 0 || BigInteger.ONE.compareTo(n) == 0) {
            return BigInteger.ONE;
        }

        return n.multiply(getFactorial(n.subtract(BigInteger.ONE)));
    }
}
//Lisa's Workbook

