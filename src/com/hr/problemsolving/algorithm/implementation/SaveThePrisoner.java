package com.hr.problemsolving.algorithm.implementation;

public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7, 19, 2));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        return ((s - 1) + (m - 1)) % n + 1;
    }

}
