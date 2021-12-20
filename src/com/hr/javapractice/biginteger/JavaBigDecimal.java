package com.hr.javapractice.biginteger;

import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal {
    public static void main(String[] args) {
        // Input

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Write your code here
        //Write your code here
        Map<String, List<BigDecimal>> map = new HashMap<>();
        BigDecimal[] bd = new BigDecimal[s.length];
        for (int i = 0; i < n; i++) {
            bd[i] = new BigDecimal(s[i]);
            map.computeIfAbsent(s[i], k -> new ArrayList<>()).add(bd[i]);
        }

        map.forEach((k, v) -> v.sort(Collections.reverseOrder()));

        s = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).map(Map.Entry::getKey).toArray(String[]::new);

//        List<BigDecimal> list = new ArrayList<>();
//        Map<BigDecimal, List<String>> map = new HashMap<>();
//
//        BigDecimal[] bd = new BigDecimal[s.length];
//        for (int i = 0; i < n; i++) {
//            bd[i] = new BigDecimal(s[i]);
//            map.computeIfAbsent(bd[i], k -> new ArrayList<>()).add(s[i]);
//        }
//
//        Stream<Map.Entry<BigDecimal, List<String>>> sortedEntryStream = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()));
//
//        sortedEntryStream.forEach(s1 -> System.out.println(s1.getKey()));
//        sortedEntryStream.forEach(entryStream -> entryStream.getValue().forEach(v -> list.add(entryStream.getKey())));
//
//        s = list.toArray(new String[0]);

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}