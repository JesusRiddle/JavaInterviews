package org.exercises;


import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

/*
Given an integer array, it should be divided into two subsets A and B, respecting following conditions:
1) Intersection of A and B is null
2) A + B = original array
3) The number of elements in subset A is minimal
4) The sum of A's weights is greater than the sum of B's weights

INPUT: arr = {1,2,3,4,5}
OUTPUT A = {4,5}
 */
class BoxWeights {
    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        Long sum = 0L;

        for (Integer integer : arr) {
            sum += integer;
        }

        Collections.sort(arr, Collections.reverseOrder());
        return divideElements(new ArrayList<>(), new ArrayList<>(arr), 0L, sum);
    }
    public static List<Integer> divideElements(List<Integer> setA, List<Integer> setB, Long sumA, Long sumB) {
        int maxItem = setB.get(0);

        setA.add(maxItem);
        sumA += maxItem;

        setB.remove(0);
        sumB -= maxItem;

        if(sumA <= sumB)
        {
            divideElements(setA, setB, sumA, sumB);
        }
        Collections.sort(setA);
        return setA;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> arr = Arrays.asList(5, 3, 2, 4, 1, 2);
        List<Integer> result = minimalHeaviestSetA(arr);
        System.out.println("arr: " + arr.toString());
        System.out.println("result: " + result.toString());
    }
}