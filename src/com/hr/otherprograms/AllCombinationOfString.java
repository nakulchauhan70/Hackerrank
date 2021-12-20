package com.hr.otherprograms;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationOfString {
    public static void main(String[] args) {
        allCombination("abc");
    }

    public static void allCombination(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        List<String> list = new ArrayList<>();
        allCombination(0, s, stringBuffer, list);
        list.forEach(System.out::println);
    }

    private static void allCombination(int start, String input, StringBuffer stringBuffer, List<String> list) {
        for (int i = start; i < input.length(); i++) {
            stringBuffer.append(input.charAt(i));
            list.add(stringBuffer.toString());

            allCombination(i + 1, input, stringBuffer, list);

            stringBuffer.setLength(stringBuffer.length() - 1);
        }
    }
}
