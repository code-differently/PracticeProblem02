package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void findLongestSeqTest1(){
        Problem02 p2 = new Problem02();
        int[] arr = {10, 12, 11};

        int actual = p2.findLongestSeq(arr);
        int expected = 3;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void findLongestSeqTest2(){
        Problem02 p2 = new Problem02();
        int[] arr = {14, 12, 11, 20};

        int actual = p2.findLongestSeq(arr);
        int expected = 2;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void findLongestSeqTest3(){
        Problem02 p2 = new Problem02();
        int[] arr = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        int actual = p2.findLongestSeq(arr);
        int expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void printLongestSeqTest(){
        Problem02 p2 = new Problem02();
        int[] arr = {10, 12, 11};
        int num = p2.findLongestSeq(arr);

        String actual = p2.getLongestSeqString();
        String expected = "Length of the longest contiguous subarray is 3";

        Assert.assertEquals(expected, actual);
    }
}
