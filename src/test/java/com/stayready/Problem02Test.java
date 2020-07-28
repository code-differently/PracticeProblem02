package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

    Problem02 p;

    @Before
    public void initialize() {
        p = new Problem02();
    }

    @Test
    public void getContinuousLengthTest() {
        int arr[] = {10, 12, 11};
        Assert.assertEquals(3, p.getContinuousLength(arr));
    }

    @Test
    public void getContinuousLengthTest2() {
        int arr[] = {14, 12, 11, 20};
        Assert.assertEquals(2, p.getContinuousLength(arr));
    }

    @Test
    public void getContinuousLengthTest3() {
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        Assert.assertEquals(5, p.getContinuousLength(arr));
    }


}
