package ua.andriy.danilevskyy.hillel;

import java.util.Arrays;
import java.util.List;

import static ua.andriy.danilevskyy.hillel.service.ArrayTools.*;

public class Main {
    public static void main(String[] args) {
//        // #1
//        // ---------------------------------------------------------------------------------
        List<String> arr = List.of("one", "two", "three", "four", "five", "ten", "nine", "two", "seven", "five", "two",
                "mimo", "ololo", "one", "andre", "car", "phone", "cat", "dog", "35");
//
//        countOccurance(arr, "null");
//
//        // #2
//        // ---------------------------------------------------------------------------------
//        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 6, 5, 4, 4, 3, 3, 2, 2};
//        List<Integer> intList = toList(intArr); // #2
//        System.out.println(Arrays.toString(intArr));
//        System.out.println(intList);
//
//        // #3
//        // ---------------------------------------------------------------------------------
//        List<Integer> intlist2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 6, 5, 4, 4, 3, 3, 2, 2, 131, 999999);
//        List<Integer> uniqueNumberList = findUnique(intlist2);
//        System.out.println(uniqueNumberList);

        // #4
        // ---------------------------------------------------------------------------------
        countOccurance(arr);
    }
}
