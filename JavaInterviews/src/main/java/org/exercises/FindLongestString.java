package org.exercises;

public class FindLongestString {

    /*
    Finds the longest consecutive string without repeating any letter
    */

    private static String longestString(String input) {
        StringBuilder inputBuffer = new StringBuilder();
        String longest = "";
        for (int i = 0; i < input.length(); i++) {
            if (!inputBuffer.toString().contains(String.valueOf(input.charAt(i)))) {
                inputBuffer.append(input.charAt(i));
                if (longest.length() < inputBuffer.length()) {
                    longest = inputBuffer.toString();
                }
            } else {
                inputBuffer.delete(0, inputBuffer.toString().length());
                i--;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println("1) " + longestString("ABCDECDEFGH"));// returns CDEFGH
        System.out.println("2) " + longestString("ABCDEFGHIJKLDMNO"));//returns ABCDEFGHIJKL
        System.out.println("3) " + longestString("ABCDDECFGHIJKLD"));//returns DECFGHIJKL
        System.out.println("4) " + longestString("ABCABCABC"));//returns ABC
        System.out.println("5) " + longestString("ABCABCABCD"));// returns ABCD
    }

}