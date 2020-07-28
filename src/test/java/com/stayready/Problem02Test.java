package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void continuousSequence01(){
        //Given
        Problem02 problem02 = new Problem02();
        int[] numArray = {10, 12, 11};
        int expected = 3;

        //When
        int actual = problem02.continuousSequence(numArray);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void continuousSequence02(){
        //Given
        Problem02 problem02 = new Problem02();
        int[] numArray = {14, 12, 11, 20};
        int expected = 2;

        //When
        int actual = problem02.continuousSequence(numArray);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void continuousSequence03(){
        //Given
        Problem02 problem02 = new Problem02();
        int[] numArray = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int expected = 5;

        //When
        int actual = problem02.continuousSequence(numArray);

        //Then
        Assert.assertEquals(expected, actual);

    }
}
