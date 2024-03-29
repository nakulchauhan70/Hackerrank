package com.hr.interviewpreperationkit.stringmanipulation;

import java.io.IOException;
import java.util.Scanner;

public class AlternatingCharacters {
    private static final Scanner scanner = new Scanner(System.in);
    public static int count = 0;

    static int alternatingCharacters(String s) {
        char[] schArr = s.toCharArray();
        for (int i = 0; i < schArr.length; i++) {
            if (i + 1 < schArr.length) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);
            System.out.println(result);
            count = 0;
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //  bufferedWriter.close();

        scanner.close();
    }
}
