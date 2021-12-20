package com.hr._1weekpreperationkit.day_4;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        System.out.println(superDigit("9", 1));
    }

    public static int superDigit(String n, int k) {
        if(n.length() == 1 && k == 1)
            return Integer.parseInt(n);

        long sum = 0;
        for(int i=0;i<n.length();i++)
            sum += Integer.parseInt(n.substring(i,i+1));

        sum *= k;

        return superDigit(Long.toString(sum), 1);
    }

//    public static int superDigit(String n, int k) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < k; i++) {
//            sb.append(n);
//        }
//
//        return (int) superDigit(Long.parseLong(sb.toString()));
//    }
//
//    private static long superDigit(long no) {
//        long sum = getSumOfDigits(no);
//        while (sum / 10 != 0) {
//            sum = getSumOfDigits(sum);
//        }
//        return sum;
//    }
//
//    private static long getSumOfDigits(long no) {
//        long sum = 0;
//        long rem = no % 10;
//        while (rem != 0) {
//            sum += rem;
//            no = no / 10;
//            rem = no % 10;
//        }
//        return sum;
//    }
}