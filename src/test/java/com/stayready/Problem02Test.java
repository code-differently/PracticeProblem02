package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void findContinuousTest(){
        int arr[] = {10, 12, 11};
        Problem02 problem02 = new Problem02();
        int expected = 3;
        int actual = problem02.findContinuous(arr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findContinuous2Test(){
        int arr[] = {14, 12, 11, 20};
        Problem02 problem02 = new Problem02();
        int expected = 2;
        int actual = problem02.findContinuous(arr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findContinuous3Test(){
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};;
        Problem02 problem02 = new Problem02();
        int expected = 5;
        int actual = problem02.findContinuous(arr);
        Assert.assertEquals(expected,actual);
    }

}
