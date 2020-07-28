package com.stayready;

import java.util.Arrays;

public class Problem02 {

    public int getContinuousLength(int arr[]){
        int count = 1;
        int max = 0;

        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] + 1 == arr[i+1]){
                count++;
                if(count > max) {
                    max = count;
                }
            }else{
                count = 1;
            }
        }
        return max;
    }

    public static void main(String [] args){
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        Problem02 p = new Problem02();
        System.out.println("Length of the longest contiguous subarray is: " + p.getContinuousLength(arr));
    }
}
