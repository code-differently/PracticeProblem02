package com.stayready;

import java.util.Arrays;

public class Problem02 {

    public int lengthOfLongestContinuousSubArray(int[] arr) {
        int max = 0;
        // Find all sub arrays
        for(int start = 0; start < arr.length; start++) {
            for(int end = start + 1; end <= arr.length; end++) {
                int[] currentSub = createSubArray(arr, start, end);
                if(isContinuous(currentSub) && currentSub.length > max) {
                    max = currentSub.length;
                }
            }
        }
        return max;
    }

    public int[] createSubArray(int[] input, int start, int end) {
        return Arrays.copyOfRange(input, start, end);
    }

    public boolean isContinuous(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] != ++arr[i]) {
                return false;
            }
        }
        return true;
    }

}
