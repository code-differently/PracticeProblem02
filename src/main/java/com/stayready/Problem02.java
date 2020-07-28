package com.stayready;

import java.util.Arrays;

public class Problem02 {

    public Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        return array;
    }

    Integer minimum(Integer x, Integer y) {
        Integer min = 0;
        if( x > y) {
            min = y;
        } else {
            min = x;
        }
        return min;
    }


    public Integer longest(Integer[] input) {
        int maxL = 1 ;
        int num = 0;
        Arrays.sort(input);
        
        for(int i = 0; i < input.length - 1; i++) {
            num ++;
            if(num > maxL) {
                maxL = num;
            }
          }
        return maxL;
    }
}
