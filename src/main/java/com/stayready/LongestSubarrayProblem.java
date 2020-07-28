package com.stayready;

import java.util.Arrays;

public class LongestSubarrayProblem {

    /**
     * @param takes in an integer array
     * @return an array sorted in ascending order
     */

    public Integer[] sortArray(Integer[] array){
        Arrays.sort(array);
        return array;
    }

    int minimumNum(int x, int y){
        return (x < y) ? x : y;
    }

    int maximumNum(int x, int y){
        return (x > y) ? x : y;
    }
}
