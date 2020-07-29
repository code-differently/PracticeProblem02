package com.stayready;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class Problem02Test {

    @Test
    public void test1(){
        //Given
        int [] testArray = {10,12,11};

        //Expected
        String expected = "Length of the longest contiguous subarray is 3";
        String actual = Problem02.continuosSequence(testArray);

        //
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test2(){
        //Given
        int [] testArray = {14,12,11,20};

        //Expected
        String expected = "Length of the longest contiguous subarray is 2";
        String actual = Problem02.continuosSequence(testArray);
        //
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test3(){
        //Given
        int [] testArray = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        //Expected
        String expected = "Length of the longest contiguous subarray is 5";
        String actual = Problem02.continuosSequence(testArray);

        //
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkMaxCountTest(){
        //Given
        int count = 3;
        int maxCount = 5;
        //Expected
        int expected = 5;
        int actual = Problem02.checkMaxCount(count,maxCount);

        //
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkMaxCountTest2(){
        //Given
        int count = 3;
        int maxCount = 1;
        //Expected
        int expected = 3;
        int actual = Problem02.checkMaxCount(count,maxCount);

        //
        Assert.assertEquals(expected,actual);
    }




}
