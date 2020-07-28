package com.stayready;

import java.util.Arrays;

public class Problem02 {

    //sort the array
    //check and see if the number(s) after the first number is directly behind it

    public String isContinuous1(int arr[], int n){
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < n; i++){
            if (arr[i] - arr[i-1] > 1) {
                return "Is not continuous";
            }else{
                count++;
            }

        }
        return "Length of the longest continuous subarray is "+count;
    }

    public String isContinuous2(int arr[], int n){
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < n; i++){
            if (arr[i] - arr[i-1] > 1) {
                count++;
                return "Length of the longest continous subarray is "+count;
            }else{
                count++;
            }

        }
        return "Length of the longest continuous subarray is "+count;
    }

    public String isContinuous3(int [] array){
        return null;
    }
}
