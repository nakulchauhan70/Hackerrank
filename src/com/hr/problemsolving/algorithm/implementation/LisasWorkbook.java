package com.hr.problemsolving.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

public class LisasWorkbook {
    public static void main(String[] args) {
        System.out.println(workbook(5, 3, List.of(4, 2, 6, 1, 10)));
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        int specialProblem = 0;
        int pageNo = 0;
        for (int i = 0; i < n; i++) {
            int problemsInChapter = arr.get(i);
            int pagesWithKProblems = problemsInChapter / k;

            int remainingProblems = problemsInChapter % k;

            if (remainingProblems != 0) {
                pagesWithKProblems++;
            }

            specialProblem += getCount(pageNo, pagesWithKProblems, problemsInChapter, k);
        }
        return specialProblem;
    }

    private static int getCount(int startPage, int endPage, int problemsInChapter, int k) {
        List<Integer> problems = new ArrayList<>();
        for (int i = 1; i <= problemsInChapter; i++) {
            problems.add(i);
        }

        int specialProblem = 0;

        for (int l = startPage; l <= endPage; l++) {
            if (problems.contains(l))
                specialProblem++;
        }

        return specialProblem;
    }
}
