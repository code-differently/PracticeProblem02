package com.stayready;
import java.util.Arrays;

public class Problem02 {

    public Integer countContinuousNumbers(Integer[] arr){
        Integer count = 1;
        Integer longestSub = count;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1 ; i++) {
            Integer nextPosition = arr[i + 1] - 1;
            if (arr[i] == nextPosition){
                count++;
                longestSub = count;
            }
            else {
                count = 1;
            }
        }

        if (longestSub > count){
            return longestSub;
        }
        else {
            return count;
        }
    }
}
