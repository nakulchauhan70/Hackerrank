package com.hr.problemsolving.algorithm.strings;

import java.util.*;
import java.util.stream.Collectors;

public class WeightedUniformStrings {
    static Map<Character, Integer> characterMap = new HashMap<>();

    static {
        int count = 1;
        for (int i = 97; i <= 122; i++) {
            characterMap.put((char) i, count++);
        }
    }

    public static void main(String[] args) {
        System.out.println('b' - 'a');
        weightedUniformStrings("abccddde", List.of(1, 3, 12, 5, 9, 10)).forEach(System.out::println);
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        String yes = "Yes";
        String no = "No";
        Set<Integer> updatedWeight = new HashSet<>();

        int start = 0;
        int end = 0;
        int weight = 0;


        while (start < s.length() && end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                weight += characterMap.get(s.charAt(start));
                updatedWeight.add(weight);
                end++;
            } else {
                start = end;
                weight = 0;
            }
        }

        return queries.stream().map(q -> {
            if (updatedWeight.contains(q)) {
                return yes;
            }
            return no;
        }).collect(Collectors.toList());
    }

    public static List<String> weightedUniformStrings1(String s, List<Integer> queries) {
        String yes = "Yes";
        String no = "No";
        HashSet<Integer> weights = new HashSet<>();
        int weight = 0;

        char prev = ' '; // so it doesn't match 1st character
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr != prev) {
                weight = 0;
            }
            weight += curr - 'a' + 1;
            weights.add(weight);
            prev = curr;
        }


        return queries.stream().map(q -> {
            if (weights.contains(q)) {
                return yes;
            }
            return no;
        }).collect(Collectors.toList());
    }
}