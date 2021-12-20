package com.hr.problemsolving.algorithm.implementation;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
//        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
//        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int position = 0;
        do {
            position = (position + k) % c.length;
            if (c[position] == 1) {
                energy -= 2;
            }

            energy--;
        } while (position != 0);

        return energy;
    }
}
