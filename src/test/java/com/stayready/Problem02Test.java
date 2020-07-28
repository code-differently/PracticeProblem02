package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

    private final int[] input01 = {10, 12, 11};
    private final int[] input02 = {14, 12, 11, 20};
    private final int[] input03 = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

    Problem02 p2;
    @Before
    public void initialize() {
        p2 = new Problem02();
    }

    @Test
    public void lengthOfLongestContinuousSubArrayTest() {
        // Given
        int expected = 3;

        // When
        int actual = p2.lengthOfLongestContinuousSubArray(input01);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestContinuousSubArrayTest2() {
        // Given
        int expected = 2;

        // When
        int actual = p2.lengthOfLongestContinuousSubArray(input02);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestContinuousSubArrayTest3() {
        // Given
        int expected = 5;

        // When
        int actual = p2.lengthOfLongestContinuousSubArray(input03);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createSubArrayTest() {
        // Given
        int start = 0;
        int end = 1;
        int[] expected = {10};

        // When
        int[] actual = p2.createSubArray(input01, start, end);

        // Then
        Assert.assertEquals(expected[0], actual[0]);
    }

    @Test
    public void createSubArrayTest2() {
        // Given
        int start = 1;
        int end = 3;
        int[] expected = {12, 11};

        // When
        int[] actual = p2.createSubArray(input01, start, end);

        // Then
        Assert.assertEquals(expected[0], actual[0]);
        Assert.assertEquals(expected[1], actual[1]);
    }

    @Test
    public void isContinuousTest() {
        // Given
        // input01 = {10, 12, 11}

        // When
        boolean actual = p2.isContinuous(input01);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isContinuousTest2() {
        // Given
        int[] input = {10, 12, 14};

        // When
        boolean actual = p2.isContinuous(input);

        // Then
        Assert.assertFalse(actual);
    }
}
