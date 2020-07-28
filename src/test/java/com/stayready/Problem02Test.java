package com.stayready;

import static org.junit.Assert.*;
import org.junit.Test;

public class Problem02Test {
    Problem02 obj = new Problem02();
    String message = "Length of the longest contiguous subarray is ";

    @Test
    public void isContiguousTest() {
        int num1 = 5;
        int num2 = 6;

        assertTrue(obj.isContiguous(num1, num2));
    }

    @Test
    public void isContiguousTest2() {
        int num1 = 5;
        int num2 = 6;

        assertTrue(obj.isContiguous(num2, num1));
    }

    @Test
    public void isContiguousTest3() {
        int num1 = 10;
        int num2 = 6;

        assertFalse(obj.isContiguous(num1, num2));
    }

    @Test
    public void longestContiguousSubArrayTest() {
        int[] nums = {10, 12, 11};

        int expected = 3;

        assertEquals(expected, obj.longestContiguousSubArray(nums));
    }

    @Test
    public void longestContiguousSubArrayTest2() {
        int[] nums = {14, 12, 11, 20};

        int expected = 2;

        assertEquals(expected, obj.longestContiguousSubArray(nums));
    }

    @Test
    public void longestContiguousSubArrayTest3() {
        int[] nums = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        int expected = 5;

        assertEquals(expected, obj.longestContiguousSubArray(nums));
    }

    @Test
    public void displayOutput() {
        int[] nums = {10, 12, 11};

        String expected = message += "3";

        assertEquals(expected, obj.displayOutput(obj.longestContiguousSubArray(nums)));
    }

    @Test
    public void displayOutput2() {
        int[] nums = {14, 12, 11, 20};

        String expected = message += "2";

        assertEquals(expected, obj.displayOutput(obj.longestContiguousSubArray(nums)));
    }

    @Test
    public void displayOutput3() {
        int[] nums = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        String expected = message += "5";

        assertEquals(expected, obj.displayOutput(obj.longestContiguousSubArray(nums)));
    }
}
