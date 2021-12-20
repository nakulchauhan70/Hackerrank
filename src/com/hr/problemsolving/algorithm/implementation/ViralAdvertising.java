package com.hr.problemsolving.algorithm.implementation;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
        System.out.println(viralAdvertising(3));

    }

    public static int viralAdvertising(int n) {
        int people = 5;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            people = (int) Math.floor(people / 2.0); //liked
            sum += people; //cumulative likes
            people *= 3; //shared
        }

        return sum;
    }
}
