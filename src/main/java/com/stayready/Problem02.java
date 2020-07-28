package com.stayready;

import java.util.Arrays;

public class Problem02 {

    /**
     * @param array an array to check for the longest continous subarray
     * @return A string with the longest continous subarray
     */
    static String getContinuousSubarray(int[] array){
        Arrays.sort(array); // Sort Array from least to greatest
        int largestCount=0; // Hold largest number of continuous numbers
        if(array.length>0) {
            int num=array[0]; // Number to check if continuous
            int count=1; //Always count itself then start looping after first element
            for (int i = 1; i < array.length; i++) {
                if(array[i]==num+1) {
                    count++;
                }
                else {
                    if(count>largestCount)
                        largestCount=count;
                    count=1;
                }
                num=array[i];
            }
            if(count>largestCount)
                largestCount=count;
        }
        return("Length of the longest contiguous subarray is "+largestCount);
    }
}
