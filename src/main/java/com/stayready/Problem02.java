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
                maxCount = Problem02.checkMaxCount(count, maxCount);
                count = 1;
            }
        }maxCount = checkMaxCount(count, maxCount);
        return "Length of the longest contiguous subarray is "+ maxCount;
    }

    public static int checkMaxCount(int count, int max){
        if(count > max) {
            max = count;
        }return max;
    }
}
