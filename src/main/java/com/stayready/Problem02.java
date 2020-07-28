package com.stayready;

public class Problem02 {

    int minimum(int x, int y){                         //functions to find minimum and maximum of two elements
        return (x < y) ? x : y;
    }

    int maximum(int x, int y){
        return (x > y) ? x : y;
    }

    public int findSubArrayLength(int arr[], int n){
        int maximum_length = 1;                         //initializes results
        for (int i = 0; i < n - 1; i++){
            int min = arr[i];                           //initializes min for subarrays starting with i
            int max = arr[i];                           //initializes max for subarrays starting with i

            for (int j = i + 1; j < n; j++){
                min = minimum(min, arr[j]);             //update min in subarray
                max = maximum(max, arr[j]);             //update max in subarray

                if((max - min) == j - i)
                    maximum_length = maximum(maximum_length, max - min + 1);    //adds the contiguous elements
            }
        }
        return maximum_length;                          //returns results
    }
}
