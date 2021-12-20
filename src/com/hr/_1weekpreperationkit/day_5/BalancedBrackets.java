package com.hr._1weekpreperationkit.day_5;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[(])}"));
    }

    public static String isBalanced(String s) {
        String openingBrackets = "({[";
        String closingBrackets = ")}]";

        HashMap<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (openingBrackets.indexOf(s.charAt(i)) >= 0) {
                stack.push(s.charAt(i));
            } else if (closingBrackets.indexOf(s.charAt(i)) >= 0) {
                if (stack.size() == 0) {
                    return "NO";
                }
                if (stack.peek() == bracketsMap.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    return "NO";
                }
            } else {
                return "NO";
            }
        }

        return stack.size() == 0 ? "YES" : "NO";

    }

//    public static String isBalanced(String s) {
//        String openingBrackets = "({[";
//        String closingBrackets = ")}]";
//
//        HashMap<Character, Character> bracketsMap = new HashMap<>();
//        bracketsMap.put(')', '(');
//        bracketsMap.put('}', '{');
//        bracketsMap.put(']', '[');
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (openingBrackets.indexOf(s.charAt(i)) >= 0) {
//                stack.add(s.charAt(i));
//            } else if (closingBrackets.indexOf(s.charAt(i)) >= 0) {
//                if (stack.size() == 0) {
//                    return "NO";
//                }
//                if (stack.get(stack.size() - 1) == bracketsMap.get(s.charAt(i))) {
//                    stack.remove(stack.size() - 1);
//                } else {
//                    return "NO";
//                }
//            } else {
//                return "NO";
//            }
//        }
//
//        return stack.size() == 0 ? "YES" : "NO";
//
//    }

}
