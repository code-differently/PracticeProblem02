package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void getContinousSubarrayTest(){
        // Given
        int[] fix={3,2,0,1,13,14};
        String expected="Length of the longest contiguous subarray is 4";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest2(){
        // Given
        int[] fix={1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        String expected="Length of the longest contiguous subarray is 5";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest3(){
        // Given
        int[] fix={14, 12, 11, 20};
        String expected="Length of the longest contiguous subarray is 2";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest4(){
        // Given
        int[] fix={9,8,7,3232,0,-1234,-2,-1,0,132};
        String expected="Length of the longest contiguous subarray is 3";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest5(){
        // Given
        int[] fix={1,2,3,4,5,6,7,8,9,19};
        String expected="Length of the longest contiguous subarray is 9";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest6(){
        // Given
        int[] fix={32,31,0,-12,-11,-1,1,2,3,4,5,-10,-9,-8,-7,6,7,8,9,19,-6,-5,-4,-3,-2,-1};
        String expected="Length of the longest contiguous subarray is 12";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getContinousSubarrayTest7(){
        // Given
        int[] fix={0,32,31,-12,-11,323,1,2,3,4,5,-10,201,-9,-8,-7,6,-1000,7,8,9,19,-6,-5,-4,-3,-2,-1};
        String expected="Length of the longest contiguous subarray is 22";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest8(){
        // Given
        int[] fix={};
        String expected="Length of the longest contiguous subarray is 0";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest9(){
        // Given
        int[] fix={1};
        String expected="Length of the longest contiguous subarray is 1";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getContinousSubarrayTest10(){
        // Given
        int[] fix={1,2,-1};
        String expected="Length of the longest contiguous subarray is 2";

        // When
        String actual=Problem02.getContinuousSubarray(fix);

        // Then
        Assert.assertEquals(expected,actual);
    }
}
