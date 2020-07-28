package com.stayready;

import java.util.Arrays;

public class Problem02 {

    public int[] sortArray(int[] sortedArray) {
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    int Contiguous(int[] arr) {
        int[] sortedArray = sortArray(arr);
        int currNum = 0; // declare current number
        int count = 0;

        for (int i = 0; i < sortedArray.length; i++) {
            if (i == 0) {
                count = 1;

            }

        }
        return 0;
    }

}
