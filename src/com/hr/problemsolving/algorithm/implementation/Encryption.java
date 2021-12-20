package com.hr.problemsolving.algorithm.implementation;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));

        System.out.println(encryption("if man was meant to stay on ground god would have given us roots"));
    }

    public static String encryption(String s) {
        StringBuilder builder = new StringBuilder();
        s = s.replace(" ","");

        int l = (int) Math.floor(Math.sqrt(s.length()));
        int h = (int) Math.ceil(Math.sqrt(s.length()));
        //haveaniceday l=3, h=4
        //hae and via ecy
        //0+4,4+4
        //1+4,5+4
        //..
        //3+4,7+4

        for (int i = 0; i < h; i++) {
            int j = i;
            while (j<s.length()) {
                builder.append(s.charAt(j));
                j = j+h;
            }
            builder.append(" ");
        }

        return builder.toString().trim();
    }
}
