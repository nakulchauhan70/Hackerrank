package com.hr._1weekpreperationkit.day_1;

import java.util.Comparator;
import java.util.List;

public class MockTest_FindTHeMedian {
    public static void main(String[] args) {

    }

    public static int findMedian(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());

        int mid = arr.size()/2;

        if (arr.size() % 2 == 0) {
            return (arr.get(mid)+arr.get(mid-1))/2;
        } else {
            return arr.get(mid);
        }
    }
}
