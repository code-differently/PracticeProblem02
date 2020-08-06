package com.stayready;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem02Test
{   
    @Test
    public void ContSubarrayTest1()
    {
        //given
        int array[] = {10, 12, 11, 4};

        //when
        int expected = 3;
        int actual = Problem02.longestContSubarray(array);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void ContSubarrayTest2()
    {
        //given
        int array[] = {14, 12, 11, 20};

        //when
        int expected = 2;
        int actual = Problem02.longestContSubarray(array);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void ContSubarrayTest3()
    {
        //given
        int array[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        //when
        int expected = 5;
        int actual = Problem02.longestContSubarray(array);

        //then
        assertEquals(expected, actual);
    }

    
}
