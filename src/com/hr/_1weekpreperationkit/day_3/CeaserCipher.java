package com.hr._1weekpreperationkit.day_3;

public class CeaserCipher {
    public static void main(String[] args) {
//        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
//        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
        System.out.println(caesarCipher("middle-Outz", 2));

    }

    public static String caesarCipher(String s, int k) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();

        String rotatedAlphabets = rotatedAlphabets(alphabets, k);
        System.out.println(rotatedAlphabets);
        for (int i = 0; i < s.length(); i++) {
            char inputCh = s.charAt(i);
            if (!Character.isLetter(inputCh)) {
                sb.append(inputCh);
                continue;
            }
//            if (!((inputCh >= 97 && inputCh <= 122) || (inputCh >= 65 && inputCh <= 90))) {
//                sb.append(inputCh);
//                continue;
//            }

            int index = alphabets.indexOf(Character.toLowerCase(inputCh));
            char ch = rotatedAlphabets.charAt(index);
            if (Character.isUpperCase(inputCh)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private static String rotatedAlphabets(String alphabets, int k) {
        char[] encryptedArr = new char[alphabets.length()];
        for (int i = 0; i < alphabets.length(); i++) {
            encryptedArr[i] = alphabets.charAt((alphabets.charAt(i) - 'a' + k) % alphabets.length());
        }
        return new String(encryptedArr);
    }
}
