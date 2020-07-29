package com.stayready;

import java.util.Arrays;

public class Problem02 {
    public static String continuosSequence(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int maxCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } else {
                if (count > maxCount)
                    maxCount = count;
                count = 1;
            }
            }if(count > maxCount)
                maxCount = count;
            return "Length of the longest contiguous subarray is " + maxCount;
        }
    }

