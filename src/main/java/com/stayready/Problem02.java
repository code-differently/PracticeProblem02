package com.stayready;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem02 {

    /**
     *
     * @param input
     * @return
     *
     * Step 1. Sort Array
     * Step 2. Iter thru array
     * Step 3. add the current index to an arraylist,
     *         if the index after the current index is current index + 1,
     *         add to arraylist
     * Step 4. keep track of the size of the arraylist to keep the longest size
     *         - the longest arraylist represents the longest subarray length
     */
    public static Integer longestSubArray(Integer[] input){
        Arrays.sort(input); // Not sure if its good practice to manipulate the input butttttt whatever I'll figure that out later
        Integer longest = 0;
        ArrayList<Integer> subArr = new ArrayList<>();
//        for (int idx = 0; idx < input.length; idx++){
//
//        }
        return longest;
    }

}
