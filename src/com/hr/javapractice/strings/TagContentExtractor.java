package com.hr.javapractice.strings;

public class TagContentExtractor {
    public static void main(String[] args) {
        System.out.println("bhbh".replaceAll("b", ""));
        System.out.println("oAbjbjbA".indexOf("A"));
        System.out.println(removeTag("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>"));
    }

    private static String removeTag(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = str.split("<");
        for (String s : split) {
            String temp = s;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '>') {
                    temp = temp.replace(String.valueOf(s.charAt(i)), "");
                }
            }
            String extractedContent = temp.replaceAll(">", "").trim();
            if (extractedContent.length() > 1) {
                stringBuilder.append(extractedContent);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


}
