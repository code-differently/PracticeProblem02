package com.stayready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem02 {

    public static String continuosSequence(int[] array){
        Arrays.sort(array);
        int count = 1;
        int maxCount = 0;

        for(int i=0; i<array.length-1; i++){
            if(array[i+1] == array[i]+1){
                count++;
            }else{
                if(count > maxCount)
                    maxCount = count;
                    count = 1;
            }
        }if(count > maxCount)
            maxCount = count;
        return "Length of the longest contiguous subarray is "+ maxCount;
    }

//    private int Compare(int max, int count){
//        if(count > max)
//            max = count;
//        return max;
//    }
}
