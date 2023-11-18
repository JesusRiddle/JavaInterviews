package org.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExercise {
    public static void main(String[] args) {
        exercise13();
    }

    private static void exercise1(){
        /*
        Write a Java program to sort a numeric array and a string array.
         */
        System.out.println("exercise1: ");

        int[] numArray = {2,3,5,2,1,7,5,3};
        String[] stringArray = {"b", "c", "a", "e", "d"};

        String strNumArray = "1) numArray: " + Arrays.toString(numArray);
        String strStringArray = "2) stringArray: " + Arrays.toString(stringArray);

        Arrays.sort(numArray);
        Arrays.sort(stringArray);

        System.out.println(strNumArray + " -> " + Arrays.toString(numArray));
        System.out.println(strStringArray + " -> " + Arrays.toString(stringArray));
        System.out.println("______________________________________");
    }
    private static void exercise2(){
        /*
        Write a Java program to sum values of an array.
         */
        System.out.println("exercise2: ");

        int[] numArray = {1, 2, 3, 4};

        System.out.println("1) numArray: " + Arrays.toString(numArray) + " -> " + Arrays.stream(numArray).sum());
        //setA.stream().reduce(0,(x,y) -> x + y);
        System.out.println("______________________________________");
    }
    private static void exercise3(){
        /*
        Write a Java program to calculate the average value of array elements.
         */
        System.out.println("exercise3: ");

        int[] numArray = {8,8,9,10};
        System.out.println("numArray AVG: " + Arrays.toString(numArray) + " -> " + Arrays.stream(numArray).average());

        for (int i = 0; i < 10; i++) {
        }
        System.out.println("______________________________________");
    }
    private static void exercise4(){
        /*
       Write a Java program to test if an array contains a specific value.
         */
        System.out.println("exercise4: ");

        int[] numArray = {7,6, 5, 8,8,9,10};

        System.out.println("numArray: " + Arrays.toString(numArray) + " contains 22 ? -> " + (Arrays.binarySearch(numArray,22) >=0 ? "yes":"nope"));
        System.out.println("numArray: " + Arrays.toString(numArray) + " contains 8 ? -> " + (Arrays.binarySearch(numArray,8) >=0 ? "yes":"nope"));
        System.out.println("______________________________________");
    }
    private static void exercise5(){
        /*
       Write a Java program to remove a specific element from an array.
         */
        System.out.println("exercise5: ");

        int[] numArray = {7, 6, 5, 8, 8, 9, 10};
        int numRemoved = 8;
        List<Integer> numList = new ArrayList<>();
        for (int num: numArray ) {
            if(num != numRemoved)
            {
                numList.add(num);
            }

        }
        System.out.println("numArray: " + Arrays.toString(numArray) + " -> " + numList);
        System.out.println("______________________________________");
    }
    private static void exercise6(){
        /*
       Write a Java program to insert an element (specific position) into an array.
         */
        System.out.println("exercise6: ");

        int[] numArray = {7, 6, 5, 8, 8, 9, 10};
        List<Integer> numList = new ArrayList<>(numArray.length+1);

        int numInserted= 4;
        int positionInserted= 16;

        for (int i = 0; i < numArray.length; i++) {
            if(i == positionInserted){
                numList.add(numInserted);
            }
            numList.add(numArray[i]);
        }

        System.out.println("numArray: " + Arrays.toString(numArray) + " -> " + numList);
        System.out.println("______________________________________");
    }
    private static void exercise7(){
        /*
       Write a Java program to find the maximum and minimum value of an array.
         */
        System.out.println("exercise7: ");

        int[] numArray = {7, 6, 5, 8, 8, 9, 10};

        int max = 0;//Arrays.stream(numArray).max().orElse(0);
        int min= numArray[0];//Arrays.stream(numArray).min().orElse(0);

        for (int num : numArray) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }

        System.out.println("numArray: " + Arrays.toString(numArray) + " -> max:" + max + ", min:" + min);
        System.out.println("______________________________________");
    }
    private static void exercise8(){
        /*
       Write a Java program to reverse an array of integer values.
         */
        System.out.println("exercise8: ");

        int[] numArray = {7, 6, 5, 8, 8, 9, 10}; //size:7
        int[] reversedNumArray = new int[numArray.length];
        int index = 0;
        for (int i = numArray.length-1; i >= 0; i--) {
            reversedNumArray[index++] = numArray[i];
        }
        System.out.println("numArray: " + Arrays.toString(numArray) + " -> reversedNumArray:" + Arrays.toString(reversedNumArray));
        System.out.println("______________________________________");
    }
    private static void exercise9(){
        /*
       Write a Java program to reverse an array of integer values.
         */
        System.out.println("exercise9: ");

        int[] numArray = {7, 6, 5, 8, 8, 9, 10}; //size:7
        int[] reversedNumArray = new int[numArray.length];
        int index = 0;
        for (int i = numArray.length-1; i >= 0; i--) {
            reversedNumArray[index++] = numArray[i];
        }
        System.out.println("numArray: " + Arrays.toString(numArray) + " -> reversedNumArray:" + Arrays.toString(reversedNumArray));
        System.out.println("______________________________________");
    }
    private static void exercise10(){
        /*
       Write a Java program to find duplicate values in an array of integer values.
         */
        System.out.println("exercise10: ");
        int[] numArray = {5, 10, 7, 6, 6, 5, 8, 8, 9, 10}; //size:8
        List<Integer> numsRepeated = new ArrayList<>();
        int pivot = 1;

        for (int numToSeek: numArray ) {
            for (int i = pivot; i < numArray.length; i++) {
                if(numToSeek == numArray[i] && !numsRepeated.contains(numToSeek)){
                    numsRepeated.add(numToSeek);
                }
            }
            pivot++;
        }

        System.out.println("numArray: " + Arrays.toString(numArray) + " -> numsRepeated:" + numsRepeated);
        System.out.println("______________________________________");
    }
    private static void exercise11(){
        /*
       Write a Java program to find duplicate values in an array of String values.
         */
        System.out.println("exercise11: ");
        String[] numArray = {"ddd", "aaa", "bbb", "ccc", "ddd", "eee", "fff", "bbb"}; //size:8
        List<String> numsRepeated = new ArrayList<>();
        int pivot = 1;

        for (String numToSeek: numArray ) {
            for (int i = pivot; i < numArray.length; i++) {
                if(numToSeek == numArray[i] && !numsRepeated.contains(numToSeek)){
                    numsRepeated.add(numToSeek);
                }
            }
            pivot++;
        }

        System.out.println("numArray: " + Arrays.toString(numArray) + " -> numsRepeated:" + numsRepeated);
        System.out.println("______________________________________");
    }
    private static void exercise12(){
        /*
      Write a Java program to find common elements between two arrays (string values)
         */
        System.out.println("exercise12: ");
        String[] stringArray1 = {"Dumbledore", "Potter", "Riddle", "Weasley", "McGonagall", "Potter", "Riddle", "Brian"}; //size:8
        String[] stringArray2 = {"Tom", "Albus", "Percival", "Wulfric", "Brian", "Dumbledore", "Tom", "Riddle", "Lord","Voldemort"}; //size:8
        List<String> stringsRepeated = new ArrayList<>();

        for (String name: stringArray1 ) {
            if(Arrays.binarySearch(stringArray2,name)>0 && !stringsRepeated.contains(name)){
                stringsRepeated.add(name);
            }
        }

        System.out.println("stringArray1: " + Arrays.toString(stringArray1));
        System.out.println("stringArray2: " + Arrays.toString(stringArray2));
        System.out.println("stringsRepeated: " + stringsRepeated);
        System.out.println("______________________________________");
    }
    private static void exercise13(){
        /*
      6. Write a Java program to remove duplicate elements from an array.
         */
        System.out.println("exercise13: ");
        int[] numArray = {5, 10, 7, 6, 6, 5, 8, 8, 9, 10}; //size:8
        List<Integer> numsRepeated = new ArrayList<>();
        for (int nums : numArray ) {
            if(!numsRepeated.contains(nums)){
                numsRepeated.add(nums);
            }
        }

        System.out.println("numArray: " + Arrays.toString(numArray) + " -> numsFiltered:" + numsRepeated);
        System.out.println("______________________________________");
    }


}