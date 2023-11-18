package org.exercises;


import java.util.*;

public class Intervals {
    //https://www.geeksforgeeks.org/minimum-set-size-for-covering-intervals/
    //https://www.youtube.com/watch?v=Qh8ZjL1RpLI
    //https://www.youtube.com/watch?v=tm2BEMmxDP8
    // Sort with respect to end point
    public static int compare(List<Integer> a,
                              List<Integer> b)
    {
        if (a.get(1).equals(b.get(1))) {
            return a.get(0).compareTo(b.get(0));
        }
        else {
            return a.get(1).compareTo(b.get(1));
        }
    }

    public static int
    intersectionSizeTwo(List<List<Integer> > intervals)
    {
        int n = intervals.size();

        // Sort the array
        Collections.sort(intervals, Intervals::compare);
        List<Integer> res = new ArrayList<>();

        // Known two rightmost point
        // in the set/res
        res.add(intervals.get(0).get(1) - 1);
        res.add(intervals.get(0).get(1));

        for (int i = 1; i < n; i++) {

            int start = intervals.get(i).get(0);
            int end = intervals.get(i).get(1);

            // Means there is no common between
            // curr interval and intervals
            // before this
            if (start > res.get(res.size() - 1)) {
                res.add(end - 1);
                res.add(end);
            }

            // Atleast 1 value from current
            // interval matches with previous
            // sets just add 1 max value
            else if (start > res.get(res.size() - 2)) {
                res.add(end);
            }
        }
        return res.size();
    }

    public static void main(String[] args) {
        List<Integer> starts = Arrays.asList(3, 2, 0, 4);
        List<Integer> ends = Arrays.asList(6, 4, 2, 7);

        // int result = interval(starts, ends);
        //System.out.println("Smallest Set Covering Intervals: " + result);

        // ranges
        List<List<Integer> > range = Arrays.asList(
                Arrays.asList(3, 6), Arrays.asList(2, 4),
                Arrays.asList(0, 2), Arrays.asList(4, 7));

        // Function Call
        System.out.println(intersectionSizeTwo(range));
    }
}