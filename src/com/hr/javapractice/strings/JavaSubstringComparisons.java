package com.hr.javapractice.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

//    private static String getSmallestAndLargest(String str, int k) {
//        SortedSet<String> set = new TreeSet<>();
//
//        for (int i = 0; i <= str.length() - k; i++) {
//            set.add(str.substring(i, i + k));
//        }
//
//        return set.first() + "\n" + set.last();
//    }

    private static String getSmallestAndLargest(String str, int k) {
        String substring = str.substring(0, k);
        String smallest = substring;
        String largest = substring;

        for (int i = 0; i <= str.length() - k; i++) {
            substring = str.substring(i, i + k);

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }
}
