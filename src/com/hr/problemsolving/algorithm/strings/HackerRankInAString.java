package com.hr.problemsolving.algorithm.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankInAString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hhaacckkekraraannk"));
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
    }

    public static String hackerrankInString(String s) {
        Pattern pattern = Pattern.compile("^\\w*[h]\\w*[a]\\w*[c]\\w*[k]\\w*[e]\\w*[r]\\w*[r]\\w*[a]\\w*[n]\\w*[k]\\w*$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find() ? "YES" : "NO";
    }

//    private static String checkIfIsHacker(String s) {
//        String str = "hackerrank";
//        if (s.length() < str.length()) {
//            return "NO";
//        }
//        int j = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
//                j++;
//            }
//        }
//        return (j == str.length() ? "YES" : "NO");
//    }
}
