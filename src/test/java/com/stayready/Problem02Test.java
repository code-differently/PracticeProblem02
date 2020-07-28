package com.stayready;

import org.junit.Test;
import org.junit.Assert;

public class Problem02Test {

    @Test
    public void sequenceTest(){
        //Given
        int[] sequence = {10, 12, 11};
        int length = 3;

        int[] sequence2 = {14, 12, 11, 20};
        int length2 = 2;

        int[] sequence3 = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int length3 = 5;
        //Then
        Assert.assertEquals(length, new Problem02Test().longestContiguous(sequence));
        Assert.assertEquals(length2, new Problem02Test().longestContiguous(sequence2));
        Assert.assertEquals(length3, new Problem02Test().longestContiguous(sequence3));
    }
}
