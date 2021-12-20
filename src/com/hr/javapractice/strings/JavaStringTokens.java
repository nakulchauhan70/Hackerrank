package com.hr.javapractice.strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        String[] strings = Arrays.stream(str.replaceAll("[^a-zA-Z0-9]", " ").split(" "))
                .map(s -> {
                    s = s.trim();
                    return s;
                }).filter(s -> s.length() != 0).toArray(String[]::new);

        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
