package com.stayready;

import java.util.Arrays;

public class Problem02 {
    public int[] sortArray(int[] starterRay){
        Arrays.sort(starterRay);
        return starterRay;
    }

    public int longestContinuity(int[] starterArray){
        int[] sortedArray = sortArray(starterArray);
        int continuityStreak = 1;
        int maxContinuity = 0;
        for(int i =0; i<sortedArray.length-1; i++){
            if(sortedArray[i]+1 == sortedArray[i+1]){
                continuityStreak++;
            }
            else if(sortedArray[i] == sortedArray[i+1]){
                //do nun
            }
            else{
                if(continuityStreak > maxContinuity){
                    maxContinuity = continuityStreak;
                }
                continuityStreak = 1;
                }
            }
            if(continuityStreak > maxContinuity){
                return continuityStreak;
            }
            return maxContinuity;
    }
}
