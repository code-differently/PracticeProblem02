package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void sortTest()
    {
        //Given 
        Problem02 problem02 = new Problem02();
        Integer[] array= {5,4,3,2,1};
        //When 
        Integer[] actuals = problem02.sort(array);
        Integer[] expecteds = {1,2,3,4,5};
        //Then
        Assert.assertArrayEquals(expecteds, actuals);
    }
    @Test
    public void maxiTest()
    {
        //Given
        Problem02 problem02 = new Problem02();
        Integer x = 10;
        Integer y = 5; 
        //When 
        Integer actual = problem02.maxi(x, y);
        Integer expected = x;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void miniTest()
    {
        //Given
        Problem02 problem02 = new Problem02();
        Integer x = 10;
        Integer y = 5; 
        //When 
        Integer actual = problem02.mini(x, y);
        Integer expected = y;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findLengthTest()
    {
        //Given 
        Problem02 problem02 = new Problem02();
        Integer[] array = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        //When 
        Integer expected = 5;
        Integer actual = problem02.findLength(array);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findLengthTest2()
    {
         //Given 
         Problem02 problem02 = new Problem02();
         Integer[] array = {10, 12, 11};
         //When 
         Integer expected = 3;
         Integer actual = problem02.findLength(array);
         //Then
         Assert.assertEquals(expected, actual);
    }
    @Test
    public void findLengthTest3()
    {
       //Given 
       Problem02 problem02 = new Problem02();
       Integer[] array =  {14, 12, 11, 20};
       //When 
       Integer expected = 2;
       Integer actual = problem02.findLength(array);
       //Then
       Assert.assertEquals(expected, actual); 
    }
}
