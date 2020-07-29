package com.stayready;

import org.junit.Test;
import org.junit.Assert;

public class Problem02Test {

    @Test
    public void Test1(){
        //Given
        int arr[] = {10, 12, 11};

        String expected = "Length of the longest contiguous subarray is 3";
        String actual = Problem02.continuosSequence(arr);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test2(){
        int arr[] = {14, 12, 11, 20};

        String expected = "Length of the longest contiguous subarray is 2";
        String actual = Problem02.continuosSequence(arr);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void Test3(){
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        String expected = "Length of the longest contiguous subarray is 5";
        String actual = Problem02.continuosSequence(arr);

        Assert.assertEquals(expected, actual);

    }
}
