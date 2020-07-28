package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem02Test {
    Problem02 temp;
    Integer [] givenArr;
    String expected;
    String actual;

    @Before
    public void setUp(){

        temp = new Problem02();
        givenArr = new Integer[]{ 10, 12, 11, 17, 18, 15, 14, 16 };
        temp.setArr(givenArr);
        expected = "";
        actual = "";

    }

    @Test
    public void sortTest(){

        expected = "[10, 11, 12, 14, 15, 16, 17, 18]";
        temp.sortArr();
        actual = Arrays.toString(temp.getArr());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countSubArrysLengthTest(){

        expected = "[3, 5]";
        temp.sortArr();
        temp.countSubArrysLength();
        actual = temp.getSubArrayCounter().toString();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findLongestSubArry(){

        expected = "5";
        temp.sortArr();
        temp.countSubArrysLength();
        temp.findLongestSubArry();
        actual += temp.getLongestSubArry();

        Assert.assertEquals(expected, actual);

    }





}
