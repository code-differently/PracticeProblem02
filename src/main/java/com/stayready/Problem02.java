package com.stayready;

import java.util.Arrays;

public class Problem02 {
    private int longestSeq;
    private int currentSeq;

    public int findLongestSeq(int[] arr){
        Arrays.sort(arr);
        longestSeq = 0;
        currentSeq = 0;

        int index = 0;
        while(index < arr.length - 1){
            currentSeq = 0;
            if((arr[index+1] - arr[index]) == 1) {
                currentSeq += 2;
                index ++;
            }

            index++;

            if(currentSeq > longestSeq)
                longestSeq = currentSeq;
        }

        checkLastIndex(index, arr);

        return longestSeq;
    }

    public void checkLastIndex(int ind, int[] ar){
        if(!(ar.length % 2 == 0)) {
            if (ar[ind] - ar[ind - 1] == 1)
                currentSeq++;

            if(currentSeq > longestSeq)
                longestSeq = currentSeq;
        }
    }

    public String getLongestSeqString(){
        String output = String.format("Length of the longest contiguous subarray is %d", longestSeq);
        return output;
    }
}
