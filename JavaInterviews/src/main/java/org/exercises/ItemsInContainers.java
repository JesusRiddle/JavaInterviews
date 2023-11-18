package org.exercises;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ItemsInContainers {

    public static void main(String[] args) {
       /* String s = "|**|*|*|";
        int[] startIndices = new int[]{1, 1, 1, 1};
        int[] endIndices = new int[]{5, 6, 7, 8};
*/
        String s = "**|*|*|";
        int[] startIndices = new int[]{1, 1, 1, 1};
        int[] endIndices = new int[]{3, 4, 5, 7};
        //output = 0, 0, 1, 2

        List<Integer> output = itemsInContainers(s,startIndices.length, startIndices,endIndices.length,endIndices);
        for ( int i: output ) {
            System.out.println(i);
        }
    }

    private static List<Integer> itemsInContainers(String inputString, int startIndicesLength, int[] startIndices, int endIndicesLength, int[] endIndices) {
        List<Integer> outputArr = new ArrayList<Integer>();
        Boolean openFlag = false;
        int counter = 0;
        int totalItemsCount = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < startIndicesLength; i++) {
            startIndex = startIndices[i]-1;
            endIndex = endIndices[i]-1;

            for (int j = startIndex; j <= endIndex; j++) {
                if(String.valueOf(inputString.charAt(j)).equals("|")){
                    openFlag = !openFlag;
                }
                if(openFlag && String.valueOf(inputString.charAt(j)).equals("*")){
                    counter++;
                }
                if(!openFlag && counter > 0){
                    totalItemsCount += counter;
                    counter = 0;
                    j--;
                }
            }

            outputArr.add(totalItemsCount);
            totalItemsCount = 0;
            counter = 0;
            openFlag = false;
            System.out.println(" ");
        }

        return outputArr;
    }
}