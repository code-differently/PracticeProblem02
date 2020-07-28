package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

    Problem02 problem;

    @Before
    public void setup() {

        this.problem = new Problem02();
    }

    @Test
    public void sortArrayTest() {
        int[] arr = { 1, 3, 2, 4 };
        int[] expected = { 1, 2, 3, 4 };

        int[] actual = problem.sortArray(arr);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOutput1() {
        int arr[] = { 10, 12, 11 };
        int expected = 3;

        Integer len = arr.length;
        int actual = problem.Contiguous(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOutput2() {
        int arr[] = { 14, 12, 11, 20 };
        int expected = 2;

        Integer len = arr.length;
        int actual = problem.Contiguous(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOutput3() {
        int arr[] = { 1, 56, 58, 57, 90, 92, 94, 93, 91, 45 };
        int expected = 5;

        Integer len = arr.length;
        int actual = problem.Contiguous(arr);

        Assert.assertEquals(expected, actual);
    }
}