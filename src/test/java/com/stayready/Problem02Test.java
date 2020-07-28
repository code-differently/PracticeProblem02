package com.stayready;

import org.junit.Assert;
import org.junit.Test;


public class Problem02Test {

    @Test
    public void isContinuousTest1(){

        int [] array1 = {10, 12, 11};
        Problem02 problem02 = new Problem02();

        String expected = "Length of the longest continuous subarray is 3";
        String actual = problem02.isContinuous1(array1, 3);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void isContinuousTest2(){

        int [] array2 = {14, 12, 11, 20};
        Problem02 problem02 = new Problem02();

        String expected = "Length of the longest continuous subarray is 2";
        String actual = problem02.isContinuous2(array2, 4);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isContinuousTest3(){

        int [] array3 = {1, 56, 58, 90, 92, 94, 93, 91, 45};
        Problem02 problem02 = new Problem02();

        String expected = "Length of the longest continuous subarray is 5";
        String actual = problem02.isContinuous3(array3);

        Assert.assertEquals(expected, actual);

    }

}
