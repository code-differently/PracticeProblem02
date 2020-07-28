package com.stayready;

import java.util.HashMap;
import java.util.HashSet;

public class Problem02 {
    public static int findContinuous(int arr[]) {
        int n = arr.length; // get the length of array
        HashSet<Integer> inputs = new HashSet<Integer>(); //inserted all the array elements into unordered set
        for (int i = 0; i < n; i++)
            inputs.add(arr[i]);
        // check each possible sequence from the start
        // then update optimal length
        int answer = 0;
        for (int i = 0; i < n; i++) {

            // if current element is the starting
            // element of a sequence
            if (inputs.contains(arr[i])) {

                // Then check for next elements in the
                // sequence
                int j = arr[i];

                // increment the value of array element
                // and repeat search in the set
                while (inputs.contains(j))
                    j++;

                // Update optimal length if this length
                // is more. To get the length as it is
                // incremented one by one
                answer = Math.max(answer, j - arr[i]);
            }
        }
        return answer;
    }
}