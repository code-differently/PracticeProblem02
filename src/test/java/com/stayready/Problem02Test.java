package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Problem02Test {

    @Test
    public void testOutput1() {
        int[] arr = { 10, 12, 11 };

        String expected = "Length of the longest contiguous subarray is 3";
        String actual = Problem02.Contiguous(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOutput2() {
        int[] arr = { 14, 12, 11, 20 };

        String expected = "Length of the longest contiguous subarray is 2";
        String actual = Problem02.Contiguous(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOutput3() {
        int[] arr = { 1, 56, 58, 57, 90, 92, 94, 93, 91, 45 };

        String expected = "Length of the longest contiguous subarray is 5";
        String actual = Problem02.Contiguous(arr);

        Assert.assertEquals(expected, actual);
    }
}