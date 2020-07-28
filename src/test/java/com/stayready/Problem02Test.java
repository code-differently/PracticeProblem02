package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test { // We love our unit tests lol

    private static final Integer[] testInput1 = {10, 12, 11};

    @Test
    public void longestSubArrayTest(){
        // Given
        Integer expected = 3;

        // When
        Integer actual = Problem02.longestSubArray(testInput1);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
