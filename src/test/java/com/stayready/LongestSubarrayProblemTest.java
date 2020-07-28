package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubarrayProblemTest {

    @Test
    public void longestContinuityTest(){
        //Given
        int[] sequence = {100, 1, 4, 55, 3, 2};
        int expected = 4;

        //When
        int actual = LongestSubarrayProblem.longestContinuity(sequence);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestContinuityTest2(){
        int[] sequence = {13, 14, 8, 9, 20, 21, 15, 16};
        int expected = 4;

        //When
        int actual = LongestSubarrayProblem.longestContinuity(sequence);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
