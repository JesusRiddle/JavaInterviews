package org.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {

    /*
    Merge two sorted arrays without duplicates:
    Input:
        arr1[] = {1,3,4,5}
        arr2[] = {2,4,6,8}
    Output:
        arr3[] = {1,2,3,4,5,6,8}
        ---------------
    Input:
        arr1[] = {5,8,9}
        arr2[] = {4,7,8}
    Output:
        arr3[] = {4,5,7,8,9}
     */

    public static void main(String[] args) {
        int arr1[] = {1,3,4,5};
        int arr2[] = {2,4,6,8};
        System.out.println(mergeArrays(arr1,arr2)); //{1,2,3,4,5,6,8}

        arr1 = new int[]{5, 8, 9};
        arr2 = new int[]{4,7,8};
        System.out.println(mergeArrays(arr1,arr2)); //{4,5,7,8,9}
    }

    private static List<Integer> mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> arr3 = new ArrayList<>();
        for (int element:arr1) {
            arr3.add(element);
        }
        for (int element:arr2) {
            if(!arr3.contains(element))
            {
                arr3.add(element);
            }
        }
        arr3.sort((x,y) -> x.compareTo(y) );
        return arr3;
    }

}