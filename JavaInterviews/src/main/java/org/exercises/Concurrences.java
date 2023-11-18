package org.exercises;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Given an array of integers, get the most common number in it:
    int[] numbers = {1,1,2,4,4,4}; // Output: "4 with 3 concurrences"
    int[] numbers = {3,4,2,3,4,12,1,2,3,1,5,2,4,6,4,3,5,1,2,4,4,4};

 */
public class Concurrences {

    public static void main(String[] args) {
        int[] numbers = {1,1,2,4,4,4};
        System.out.println(getConcurrences(numbers));// Output: "4 with 3 concurrences"

        numbers = new int[] {3,5,2,3,4,5,1,2,3,1,5,2,4,5,4,3,5,1,2,4,5,4};
        System.out.println(getConcurrences(numbers));// Output: "5 with 6 concurrences"
    }

    private static String getConcurrences(int[] numbers) {
        int[] concurrences = new int[numbers.length];
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            for (int index2 = 0; index2 < numbers.length; index2++) {
                if(numbers[index] == numbers[index2])
                    sum++;
            }
            concurrences[index] = sum;
            sum = 0;
        }

        int max = 0;
        for (int index = 0; index < numbers.length; index++) {
            if(concurrences[index] >  concurrences[max])
                max = index;
        }

        return "The most common value is: " + numbers[max]
                + " with " + concurrences[max] + " concurrences";
    }
}