package com.stayready;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubarrayProblem {

  public static int longestContinuity(int[] array){
    Arrays.sort(array);

    int longestSequence = 1;
    int currentSequence = 1;

    for (int i = 1; i < array.length; i++) {
        if (array[i] != array[i-1]) {
            if (array[i] == array[i-1]+1) {
                currentSequence += 1;
            }
            else {
                longestSequence = Math.max(longestSequence, currentSequence);
                currentSequence = 1;
            }
        }
    }
    return Math.max(longestSequence, currentSequence);
}
}
