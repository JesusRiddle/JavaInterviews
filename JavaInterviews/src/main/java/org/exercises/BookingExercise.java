package org.exercises;

import java.util.ArrayList;
import java.util.List;
/*
You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.
A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events.).
The event can be represented as a pair of integers start and end that represents a booking on the half-open interval [start, end),
the range of real numbers x such that start <= x < end.
*/
public class BookingExercise {
    static List<Integer> bookingList = new ArrayList<>();

    public boolean book(int start, int end) {
        List<Integer> datesList = new ArrayList<>();

        for (int i = start; i < end; i++) {
            if(bookingList.contains(i)) return false;

            datesList.add(i);
        }
        bookingList.addAll(datesList);
        return true;
    }

    public static void main(String[] args) {
        BookingExercise main = new BookingExercise();
        System.out.println(main.book(5, 8)); // return True
        System.out.println(main.book(8, 20)); // return True
        System.out.println(main.book(15, 20)); // return False
        System.out.println(main.book(21, 30)); // return true
        System.out.println(main.book(4, 32)); // return false
    }
}