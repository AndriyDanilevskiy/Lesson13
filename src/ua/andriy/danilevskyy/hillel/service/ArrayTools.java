package ua.andriy.danilevskyy.hillel.service;

import java.util.*;

public class ArrayTools {

    public static void countOccurance(List<String> list, String str) {
        if (list == null || str == null) {
            throw new IllegalArgumentException("Invalid input parameter.");
        }
        int counter = 0;
        for (String s : list) {
            if (s.equals(str)) {
                counter++;
            }
        }
        System.out.println("The array contain " + counter + " word: '" + str + "'");
    }

    public static List<Integer> toList(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Invalid input parameter.");
        }
        List<Integer> intList = new ArrayList<>();
        for (int i : arr) {
            intList.add(i);
        }
        return intList;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("Invalid input parameter.");
        }

        List<Integer> uniqueNumberList = new ArrayList<>();
        for (int i : list) {
            if (!uniqueNumberList.contains(i)) {
                uniqueNumberList.add(i);
            }
        }
        return uniqueNumberList;
    }

    public static void countOccurance(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("Invalid input parameter.");
        }
        Map<String, Integer> words = new HashMap<>();
        for (String s : list) {
            if (!words.containsKey(s)) {
                words.put(s, 1);
            } else {
                int amount = words.get(s);
                words.replace(s, amount + 1);
            }
        }

        for (Object item : words.entrySet()) {
            System.out.println(item.toString().replace("=", ": "));
        }
    }
}
