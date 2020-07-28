package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {
    Problem02 prob2;

    @Before
    public void initial(){
        prob2 = new Problem02();
    }

    @Test
    public void sortingTest() {

        //Given
        Integer[]  array = {5,4,3,2,1};
        Integer[] expected = {1,2,3,4,5};

        //When
        Integer[] actual = prob2.sort(array);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void minTest() {
        //Given
        Integer x = 5;
        Integer y = 10;
        Integer expected = prob2.minimum(x,y);

        //When
        Integer actual = x;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestTest() {
        //Given
        Integer[] input = {10,11,12,13};
        Integer expected = 3;

        //When
        Integer actual = prob2.longest(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

}
