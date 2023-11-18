package org.exercises;


import java.io.*;
import java.util.*;
/*
 * Complete the 'missingNumbers' function below.
 * Given two arrays of integers, find which elements in the SECOND array are missing from the FIRST array.

 * Example
 * List<Integer> arr = Arrays.asList(7,2,5,3,5,3);
 * List<Integer> brr = Arrays.asList(7,2,5,4,6,3,5,3);
 * The  array is the original list. The numbers missing are [4, 6].

 * Notes:
 * If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
 * Return the missing numbers sorted ascending.
 * Only include a missing number once, even if it is missing multiple times.
 * The difference between the maximum and minimum numbers in the original list is less than or equal to .
 */

public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        HashMap<Integer, Integer> aMap = new HashMap<>();
        HashMap<Integer, Integer> bMap = new HashMap<>();
        List<Integer> missingNumbers = new ArrayList();
        int counter = 0;

        for (Integer number: arr ) {
            counter = aMap.getOrDefault(number,0);
            aMap.put(number,++counter);
        }

        for (Integer number: brr ) {
            counter = bMap.getOrDefault(number,0);
            bMap.put(number,++counter);
        }

        for(Integer number : bMap.keySet()){
            if (!aMap.containsKey(number) || !aMap.get(number).equals(bMap.get(number))) {
                missingNumbers.add(number);
            }
        }
        //Order elements
        missingNumbers.sort(Integer::compareTo);
        return missingNumbers;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(7,2,5,3,5,3);
        List<Integer> brr = Arrays.asList(7,2,5,4,6,3,5,3);
        System.out.println(missingNumbers(arr, brr)); //[4, 6]

        arr = Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
        brr = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);
        System.out.println(missingNumbers(arr, brr)); //[204, 205, 206]

    }
}