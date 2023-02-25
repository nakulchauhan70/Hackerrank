package com.hr.problemsolving.algorithm.implementation;

public class HalloweenSale {
    public static void main(String[] args) {
//        System.out.println(howManyGames(20, 3, 6, 85));
//        System.out.println(howManyGames(20, 3, 6, 80));
        System.out.println(howManyGames(20, 3, 6, 70));
    }

    public static int howManyGames(int p, int d, int m, int s) {
        if (s < p)
            return 0;

        int noOfGamesBuy = 1;
        int costOfGames = p;
        int costOfNextGame = p;

        while (true) {
            costOfNextGame = costOfNextGame - d; //17,14,11,9,6,3
            if (costOfNextGame < m) {
                costOfNextGame = m;
            }

            costOfGames += costOfNextGame; //20+17 = 37+14 = 51+11 = 62+9 = 71+6 = 77+3 = 80

            if (costOfGames <= s) {
                noOfGamesBuy++;//1,2,3,4,5,6
            } else {
                break;
            }
        }

        return noOfGamesBuy;
    }
}
