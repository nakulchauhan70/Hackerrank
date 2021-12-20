package com.hr._1weekpreperationkit.day_1;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));

        //1PM  -> 13 -> (1+12)%24 ->13
        //10PM -> 22 -> (10+12)%24 -> 22
        //12PM -> 00AM  (12+12)%24 -> 0
        //13PM -> 13PM  (13+12)%24 -> 1

        //1AM  -> 1 -> (1+24)%12
        //10AM -> 10-> (10+24)%12
        //12AM -> 00PM (12+24)%12
        //
    }


    public static String timeConversion(String s) {
        String[] strings = s.split(":");
        StringBuilder sb = new StringBuilder();

        if (strings[2].contains("AM") && strings[0].equals("12")) {
            sb.append("00").append(":");
        } else if (strings[2].contains("PM") && !strings[0].equals("12")) {
            sb.append((Integer.parseInt(strings[0]) + 12)).append(":");
        } else {
            sb.append(strings[0]).append(":");
        }

        strings[2] = strings[2].substring(0, 2);

        sb.append(strings[1]).append(":");
        sb.append(strings[2]);

        return sb.toString();
    }
}
