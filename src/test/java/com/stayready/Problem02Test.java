package com.stayready;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem02Test {

    @Test
    public void isContinuousTest(){
        //Given
        Problem02 problem02 = new Problem02();
        //When
        int num1 = 8;
        int num2 = 9;
        //Then 
        assertTrue(problem02.isContinuous(num1, num2));
    }

    @Test
    public void isContinuousTest2(){
        //Given
        Problem02 problem02 = new Problem02();
        //When 
        int num1 = 7;
        int num2 = 11;
        //Then
        assertFalse(problem02.isContinuous(num1, num2));
    }


    @Test
    public void longestContSubarrayTest(){
    //Given 
    Problem02 problem02 = new Problem02();
    int[] arr = {10, 12, 11};
    //When
    int expected = 2;
    //Then
    assertEquals(expected, problem02.findLongestSubarray(arr));
    }
}
