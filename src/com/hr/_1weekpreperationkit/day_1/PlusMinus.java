package com.hr._1weekpreperationkit.day_1;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
//        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (Integer integer : arr) {
            if (integer > 0) {
                positiveCount++;
            } else if (integer < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double size = arr.size();

        System.out.println(decimalFormat.format(positiveCount / size));
        System.out.println(decimalFormat.format(negativeCount / size));
        System.out.println(decimalFormat.format(zeroCount / size));
    }
}
