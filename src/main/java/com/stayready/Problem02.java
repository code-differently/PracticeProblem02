package com.stayready;

import java.util.Arrays;

public class Problem02 {

    //method to find if elements are continuous
    public boolean isContinuous(int num1, int num2){
        if(Math.abs(num1 - num2) != 1){
            return false;
        } else
            {
            return true;
            }
    }

        

    public int findLongestSubarray(int[] arr){

        Arrays.sort(arr);
       
        int maxLength = 1;
        int count = 0;

        for(int i = 0; i < arr.length -1; i++){
            count++;
            if(count > maxLength){
                maxLength = count;
            }
           
        }
        return maxLength;
    }
}
