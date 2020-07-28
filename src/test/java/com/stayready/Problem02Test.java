package com.stayready;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Problem02Test 
{
    Problem02 pb2;
    @Before
    public void initialize()
    {
        pb2 = new Problem02();
    }

    @Test
    public void longestTest1()
    {
        Integer [] tester = {10,12,11};
        int expected = 3;

        int actual = pb2.findLongest(tester);

        assertEquals(expected, actual);

    }

    @Test
    public void longestTest2()
    {
        Integer arr[] = {14, 12, 11, 20};
        int expected = 2;

        int actual = pb2.findLongest(arr);

        assertEquals(expected, actual);

    }

    @Test
    public void longestTest3()
    {
        Integer arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int expected = 5;

        int actual = pb2.findLongest(arr);

        assertEquals(expected, actual);

    }
}
