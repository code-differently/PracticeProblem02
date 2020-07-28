package com.stayready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    Problem02 problem02;




    @Test

    public void testSort(){

        Integer[] test = {1,4,5,9,0,5};

        Integer[] sortedTest = {0,1,4,5,5,9};


        List <Integer> expectedList = new ArrayList<>();
        expectedList.addAll(Arrays.asList(sortedTest));

        List<Integer> actualList = Problem02.sort(test);

        Assert.assertEquals(expectedList, actualList);


    }

    @Test

    public void testChain(){

        Integer[] test = {10, 12, 11};

        int expectedChain = 3;
        int actualChain = Problem02.findChain(test);

        Assert.assertEquals(expectedChain, actualChain);



    }

    @Test

    public void testChain2(){

        Integer[] test = {14, 12, 11, 20};

        int expectedChain = 2;
        int actualChain = Problem02.findChain(test);

        Assert.assertEquals(expectedChain, actualChain);



    }

    @Test

    public void testChain3(){

        Integer[] test = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        int expectedChain = 5;
        int actualChain = Problem02.findChain(test);

        Assert.assertEquals(expectedChain, actualChain);



    }

    @Test

    public void testChain4(){

        Integer[] test = {21, 36, 58, 47, 90, 82, 94, 3, 61, 75};

        int expectedChain = 0;
        int actualChain = Problem02.findChain(test);

        Assert.assertEquals(expectedChain, actualChain);



    }
}
