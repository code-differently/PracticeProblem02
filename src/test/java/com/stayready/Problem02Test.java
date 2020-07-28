package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void countContinuousNumbersTest(){
        // Given
        Problem02 p = new Problem02();
        Integer[] arr = {10, 12, 11};
        // When
        Integer expected = 3;
        Integer actual = p.countContinuousNumbers(arr);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countContinuousNumbersTest2(){
        // Given
        Problem02 p = new Problem02();
        Integer[] arr = {14, 12, 11, 20};
        // When
        Integer expected = 2;
        Integer actual = p.countContinuousNumbers(arr);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void countContinuousNumbersTest3(){
        // Given
        Problem02 p = new Problem02();
        Integer[] arr = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        // When
        Integer expected = 5;
        Integer actual = p.countContinuousNumbers(arr);
        // Then
        Assert.assertEquals(expected, actual);
    }


}
