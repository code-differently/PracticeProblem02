package com.stayready;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class Problem02Test {
    @Test
    public void addIntoHashTest(){
        //Given
        int expected = 3;

        //When
        Problem02 problem = new Problem02();
        int[] array = {10,12,11};
        HashSet<Integer> hash = problem.addIntoHash(array);
        int actual = hash.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addIntoHashTest2(){
        //Given
        int expected = 4;

        //When
        Problem02 problem = new Problem02();
        int[] array = {11,12,14,20};
        HashSet<Integer> hash = problem.addIntoHash(array);
        int actual = hash.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addIntoHashTest3(){
        //Given
        int expected = 10;

        //When
        Problem02 problem = new Problem02();
        int[] array = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        HashSet<Integer> hash = problem.addIntoHash(array);
        int actual = hash.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void continuousSubarrayTest(){
        //Given
        String expected = "Length of the longest contiguous subarray is 3";
        //When
        Problem02 problem = new Problem02();
        String actual = problem.continuousSubarray(new int[]{10, 11, 12});
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void continuousSubarrayTest2(){
        //Given
        String expected = "Length of the longest contiguous subarray is 2";
        //When
        Problem02 problem = new Problem02();
        String actual = problem.continuousSubarray(new int[]{11, 12, 14, 20});
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void continuousSubarrayTest3(){
        //Given
        String expected = "Length of the longest contiguous subarray is 5";
        //When
        Problem02 problem = new Problem02();
        String actual = problem.continuousSubarray(new int[]{1, 56, 58, 57, 90, 92, 94, 93, 91, 45});
        //Then
        Assert.assertEquals(expected, actual);
    }
}
