package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void input01Test(){
        //Given
        Problem02 prob = new Problem02();
        int arr[] = {10, 12, 11};
        String expected = "Length of the longest contiguous subarray is 3";

        //When
        int n = arr.length;
        String actual = "Length of the longest contiguous subarray is " + prob.findSubArrayLength(arr, n);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void input02Test(){
        //Given
        Problem02 prob = new Problem02();
        int arr[] = {14, 12, 11, 20};
        String expected = "Length of the longest contiguous subarray is 2";

        //When
        int n = arr.length;
        String actual = "Length of the longest contiguous subarray is " + prob.findSubArrayLength(arr, n);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void input03Test(){
        //Given
        Problem02 prob = new Problem02();
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        String expected = "Length of the longest contiguous subarray is 5";

        //When
        int n = arr.length;
        String actual = "Length of the longest contiguous subarray is " + prob.findSubArrayLength(arr, n);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
