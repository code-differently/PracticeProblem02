package com.stayready;

import java.beans.Transient;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {
    @Test
    public void sortTest(){
        //Given
        Problem02 prac = new Problem02();
        int[] prospectArray = {5,1,3,2,4};
        //When
        int[] expected = {1,2,3,4,5};
        int[] actual = prac.sortArray(prospectArray);
        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void contiguosTest(){
        //Given
        Problem02 prac = new Problem02();
        int[] prospectArray = {5,1,3,2,4};
        //When
        int actual = prac.longestContinuity(prospectArray);
        int expected = 5;
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void contiguosTest2(){
        //Given
        Problem02 prac = new Problem02();
        int[] prospectArray = {5,1,3,2,4,10,12,13,6,29,7};
        //When
        int actual = prac.longestContinuity(prospectArray);
        int expected = 7;
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void contiguosTest3(){
        //Given
        Problem02 prac = new Problem02();
        int[] prospectArray = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        //When
        int actual = prac.longestContinuity(prospectArray);
        int expected = 5;
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void contiguosTestNegatives(){
        //Given
        Problem02 prac = new Problem02();
        int[] prospectArray = {24,-1,-3,9,-2,-4,0,1};
        //When
        int actual = prac.longestContinuity(prospectArray);
        int expected = 6;
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void contiguosTestRepeats(){
        //Given
        Problem02 prac = new Problem02();
        int[] prospectArray = {-4,-3,-2,-1,0,1,0,0,0};
        //When
        int actual = prac.longestContinuity(prospectArray);
        int expected = 6;
        //Then
        Assert.assertEquals(expected, actual);

    }


}
