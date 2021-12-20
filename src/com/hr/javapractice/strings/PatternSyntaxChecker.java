package com.hr.javapractice.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        if (testCases > 0) {
            while (in.hasNextLine()) {
                String pattern = in.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (Exception e) {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
