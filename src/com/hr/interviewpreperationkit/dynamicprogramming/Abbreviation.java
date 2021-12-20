package com.hr.interviewpreperationkit.dynamicprogramming;

public class Abbreviation {
    public static void main(String[] args) {
        System.out.println(abbreviation("EAbcDE", "ABDE"));
        System.out.println(abbreviation("AfPZN", "APZNC"));
        System.out.println(abbreviation("LDJAN", "LJJM"));
        System.out.println(abbreviation("UMKFW", "UMKFW"));
        System.out.println(abbreviation("KXzQ", "K"));
        System.out.println(abbreviation("LIT", "LIT"));
        System.out.println(abbreviation("QYCH", "QYCH"));
        System.out.println(abbreviation("DFIQG", "DFIQG"));
        System.out.println(abbreviation("sYOCa", "YOCN"));
        System.out.println(abbreviation("JHMWY", "HUVPW"));
    }
//    YES
//            NO
//    NO
//            YES
//    NO
//            YES
//    YES
//            YES
//    NO
//            NO
    public static String abbreviation(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < b.length(); i++) {
            if (a.indexOf(b.charAt(i)) < 0) {
                return "NO";
            }
        }

        return "YES";
    }

}
