package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test
{
    @Test
    public void testSequence()
    {
        int[] seq = {10, 12, 11};
        int len = 3;

        int[] seq2 = {14, 12, 11, 20};
        int len2 = 2;

        int[] seq3 = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int len3 = 5;

        Assert.assertEquals(len, new Problem02().longestContiguous(seq));
        Assert.assertEquals(len2, new Problem02().longestContiguous(seq2));
        Assert.assertEquals(len3, new Problem02().longestContiguous(seq3));
    }
}
