package com.hr.problemsolving.algorithm.implementation;

public class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
        System.out.println(chocolateFeast(10, 2, 5));
        System.out.println(chocolateFeast(12, 4, 4));
        System.out.println(chocolateFeast(6, 2, 2));

    }

    public static int chocolateFeast(int amount, int barCost, int noOfWrappers) {
        int noOfChocolatesEaten = amount / barCost;
        int wrappersRemaining = noOfChocolatesEaten;

        while (wrappersRemaining >= noOfWrappers) {
            int additionalChocolateEaten = wrappersRemaining / noOfWrappers;
            noOfChocolatesEaten = noOfChocolatesEaten + additionalChocolateEaten;
            wrappersRemaining = wrappersRemaining % noOfWrappers;
            wrappersRemaining = wrappersRemaining + additionalChocolateEaten;
        }

        return noOfChocolatesEaten;
    }
}
